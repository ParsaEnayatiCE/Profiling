package part2;

public class OptimizedCpuDemo {
    public static void main(String[] args) {
        System.out.println("CPU Optimized Demo Started...");

        dummyMethod();
        long sum = optimizedCpuMethod();
        System.out.println("Calculated Sum: " + sum);

        System.out.println("CPU Optimized Demo Finished.");
    }

    /**
     Optimized Version O(n)
     */
    public static long optimizedCpuMethod() {
        long totalSum = 0;
        long innerSum = 0;

        for (int j = 0; j < 10000; j++) {
            innerSum += j;
        }

        for (int i = 0; i < 100000; i++) {
            totalSum += i * innerSum;
        }

        return totalSum;
    }

    public static void dummyMethod() {
        System.out.println("This is a Dummy Method.");
    }
}
