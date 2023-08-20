package complexity;
public class ComplexityAnalyzer<T> {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public void analyzeOperation(Operation<T> operation, T input) {
        start();
        operation.execute(input);
        stop();

        System.out.println("Time Complexity: " + getElapsedTime() + " ns");
        System.out.println("Space Complexity: " + getMemoryUsage() + " bytes");
    }

    private long getMemoryUsage() {
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // Run the garbage collector to reduce memory used by unreferenced objects
        System.gc();

        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        return afterMemory - beforeMemory;
    }

    public interface Operation<T> {
        void execute(T input);
    }
    public static String getTimeComplexity(long elapsedTime, long inputSize) {
        if (elapsedTime < inputSize * inputSize) {
            return "O(n^2)";
        } else if (elapsedTime < inputSize * inputSize * inputSize) {
            return "O(n^3)";
        } else {
            return "O(n)";
        }
    }
}

