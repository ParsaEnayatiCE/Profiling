package part2;

import java.util.ArrayList;
import java.util.List;

public class OriginalMemoryDemo {

    public static void main(String[] args) {
        System.out.println("Memory Original Demo Started...");

        dummyMethod();
        List<String> strings = originalMemoryIntensiveMethod();
        System.out.println("Number of Generated Strings: " + strings.size());

        System.out.println("Memory Original Demo Finished.");
    }

    public static List<String> originalMemoryIntensiveMethod() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            strings.add("String " + i);
        }
        return strings;
    }

    public static void dummyMethod() {
        System.out.println("This is a Dummy Method.");
    }
}
