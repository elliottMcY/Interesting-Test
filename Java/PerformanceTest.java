
public class PerformanceTest {
    public PerformanceTest() {
    }

    public static void main(String[] var0) {
        long totalDuration = 0L;
        short numRuns = 1000;

        for(int i = 0; i < numRuns; ++i) {
            long start = System.nanoTime();

            for(int j = 0; j < 1000000; ++j) {
                int k = j + 1;
            }

            long end = System.nanoTime();
            long duration = (end - start) / 1000000L; // Time in milliseconds
            totalDuration += duration;
        }

        double averageDuration = (double) totalDuration / numRuns;
        System.out.printf("Average execution time over %d runs: %.2f ms", numRuns, averageDuration);
    }
}

