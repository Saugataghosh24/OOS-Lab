class Main {
    private static volatile int sum = 0;
    private static final int N = 100;

    public static void main(String[] args) throws InterruptedException {
        Thread series1Thread = new Thread(() -> {
            for (int i = 1; i <= N; i += 2) {
                sum += i;
            }
        });

        Thread series2Thread = new Thread(() -> {
            for (int i = 2; i <= N; i += 2) {
                sum += i;
            }
        });

        series1Thread.start();
        series2Thread.start();

        series1Thread.join();
        series2Thread.join();

        System.out.println("Sum of the series: " + sum);
    }
}
