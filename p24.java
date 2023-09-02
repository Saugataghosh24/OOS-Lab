import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Main {
    private static final int ARRAY_SIZE = 100;
    private static final int NUM_THREADS = ARRAY_SIZE / 10;
    private static final int SEARCH_ELEMENT = 42;

    private static volatile int[] array = new int[ARRAY_SIZE];
    private static volatile boolean elementFound = false;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i * 2;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++) {
            final int startIndex = i * 10;
            final int endIndex = startIndex + 9;
            executorService.execute(() -> searchInRange(startIndex, endIndex));
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            executorService.execute(() -> searchElement(SEARCH_ELEMENT));
        }

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        if (elementFound) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
    }

    private static void searchInRange(int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;

        while (left <= right && !elementFound) {
            int mid = left + (right - left) / 2;

            if (array[mid] == SEARCH_ELEMENT) {
                elementFound = true;
                return;
            } else if (array[mid] < SEARCH_ELEMENT) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    private static void searchElement(int element) {
        for (int i = 0; i < ARRAY_SIZE; i += 10) {
            if (array[i] == element) {
                elementFound = true;
                return;
            }
        }
    }
}
