class ChildThread extends Thread 
{
    public void run() {
        System.out.println("In child thread");
    }
}

class Main {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("In main thread");

        ChildThread ct= new ChildThread();
        ct.start();
    }
}
