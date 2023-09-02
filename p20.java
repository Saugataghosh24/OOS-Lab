class Printer {
    private int count = 1;
    private final int MAX_COUNT = 8;

    public synchronized void printEven() {
        while (count <= MAX_COUNT) {
            if (count % 2 == 0) {
                System.out.println(count);
                count++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printOdd() {
        while (count <= MAX_COUNT) {
            if (count % 2 == 1) {
                System.out.println(count);
                count++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class EvenThread extends Thread {
    private Printer printer;

    public EvenThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printEven();
    }
}

class OddThread extends Thread {
    private Printer printer;

    public OddThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printOdd();
    }
}

class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread evenThread = new EvenThread(printer);
        Thread oddThread = new OddThread(printer);

        evenThread.start();
        oddThread.start();
    }
}
