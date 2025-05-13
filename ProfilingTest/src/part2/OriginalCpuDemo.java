package part2;

import java.util.List;

public class OriginalCpuDemo {
    public static void main(String[] args) {
        System.out.println("CPU Original Demo Started...");

        dummyMethod();
        long sum = originalCpuIntensiveMethod();
        System.out.println("Calculated Sum: " + sum);

        System.out.println("CPU Original Demo Finished.");
    }

    /**
     Calculations in O(n^2)
     **/
    public static long originalCpuIntensiveMethod() {
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 10000; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    public static void dummyMethod() {
        System.out.println("This is a Dummy Method.");
    }
}
