import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Main {
    private static final int ARRAY_SIZE = 100;
    private static final int NUM_THREADS = ARRAY_SIZE / 10;
    private static final int SEARCH_ELEMENT = 42;

    private static volatile int[] array = new int[ARRAY_SIZE];
    private static volatile int foundThreadIndex = -1;
    private static volatile int foundIndex = -1;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i * 2;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++) {
            final int startIndex = i * 10;
            final int endIndex = startIndex + 9;
            final int threadIndex = i;
            executorService.execute(() -> searchInRange(threadIndex, startIndex, endIndex));
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadIndex = i;
            executorService.execute(() -> searchElement(threadIndex, SEARCH_ELEMENT));
        }

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        if (foundThreadIndex != -1 && foundIndex != -1) {
            System.out.println("Element found in thread: " + foundThreadIndex);
            System.out.println("Location: " + foundIndex);
        } else {
            System.out.println("Element not found!");
        }
    }

    private static void searchInRange(int threadIndex, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;

        while (left <= right && foundThreadIndex == -1) {
            int mid = left + (right - left) / 2;

            if (array[mid] == SEARCH_ELEMENT) {
                foundThreadIndex = threadIndex;
                foundIndex = mid;
                return;
            } else if (array[mid] < SEARCH_ELEMENT) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    private static void searchElement(int threadIndex, int element) {
        for (int i = 0; i < ARRAY_SIZE; i += 10) {
            if (array[i] == element) {
                foundThreadIndex = threadIndex;
                foundIndex = i;
                return;
            }
        }
    }
}
