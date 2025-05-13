package part2;

import java.util.ArrayList;
import java.util.List;

public class OptimizedMemoryDemo {
    public static void main(String[] args) {
        System.out.println("Memory Optimized Demo Started...");

        dummyMethod();
        List<String> strings = optimizedMemoryMethod();
        System.out.println("Number of Generated Strings: " + strings.size());

        System.out.println("Memory Optimized Demo Finished.");
    }


    public static List<String> optimizedMemoryMethod() {
        List<String> strings = new ArrayList<>(1000000);
        StringBuilder sb = new StringBuilder("String ");
        int baseLength = sb.length();

        for (int i = 0; i < 1000000; i++) {
            sb.setLength(baseLength);
            sb.append(i);
            strings.add(sb.toString());
        }

        return strings;
    }

    public static void dummyMethod() {
        System.out.println("This is a Dummy Method.");
    }
}