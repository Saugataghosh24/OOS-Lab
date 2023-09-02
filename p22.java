import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ProducerThread implements Runnable {
    private final String filename;
    private final ConsumerThread consumerThread;

    public ProducerThread(String filename, ConsumerThread consumerThread) {
        this.filename = filename;
        this.consumerThread = consumerThread;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                consumerThread.addNumber(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        consumerThread.setProducerFinished(true);
    }
}

class ConsumerThread implements Runnable {
    private int sum = 0;
    private boolean producerFinished = false;

    public synchronized void addNumber(int number) {
        sum += number;
        notify(); 
    }

    public synchronized int getSum() {
        return sum;
    }

    public synchronized boolean isProducerFinished() {
        return producerFinished;
    }

    public synchronized void setProducerFinished(boolean producerFinished) {
        this.producerFinished = producerFinished;
        notify(); 
    }

    public void run() {
        synchronized (this) {
            while (true) {
                try {
                    if (isProducerFinished() && sum > 0) {
                        break;
                    }

                    wait(); 

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Sum: " + getSum());
    }
}

class p22 {
    public static void main(String[] args) {
        String filename = "numbers.txt";

        ConsumerThread consumerThread = new ConsumerThread();
        ProducerThread producerThread = new ProducerThread(filename, consumerThread);

        Thread producer = new Thread(producerThread);
        Thread consumer = new Thread(consumerThread);

        producer.start();
        consumer.start();
    }
}
