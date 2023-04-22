public class LaptopPerformanceTest {
    public static void main(String[] args) {
        // Define matrix sizes
        int matrixSize = 1000;
        int[][] matrixA = new int[matrixSize][matrixSize];
        int[][] matrixB = new int[matrixSize][matrixSize];
        int[][] result = new int[matrixSize][matrixSize];

        // Initialize matrices with random values
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }

        // Multiply matrices and measure time taken
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                for (int k = 0; k < matrixSize; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        long endTime = System.currentTimeMillis();

        // Print out time taken
        System.out.println("Time taken to perform matrix multiplication: " + (endTime - startTime) + " milliseconds");
    }
}
