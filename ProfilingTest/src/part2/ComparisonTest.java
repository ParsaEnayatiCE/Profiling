package part2;

import java.util.List;

public class ComparisonTest {
    public static void main(String[] args) {
        // Cpu Results Test
        long originalSum = new OriginalCpuDemo().originalCpuIntensiveMethod();
        long optimizedSum = new OptimizedCpuDemo().optimizedCpuMethod();
        System.out.println("Results Comparison:");
        System.out.println("Original: " + originalSum);
        System.out.println("Optimized" + optimizedSum);
        System.out.println("Are the results same?" + (originalSum == optimizedSum));

        // Memory Results Test
        List<String> originalStrings = new OriginalMemoryDemo().originalMemoryIntensiveMethod();
        List<String> optimizedStrings = new OptimizedMemoryDemo().optimizedMemoryMethod();
        System.out.println("Results Comparison: ");
        System.out.println("Original number: " + originalStrings.size());
        System.out.println("Optimized number: " + optimizedStrings.size());
        System.out.println("Are First Strings the same? " +
                originalStrings.get(0).equals(optimizedStrings.get(0)));
        System.out.println("Are Last Strings the same? " +
                originalStrings.get(999999).equals(optimizedStrings.get(999999)));
    }
}
