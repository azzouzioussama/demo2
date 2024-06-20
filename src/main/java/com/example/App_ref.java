package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App_ref {
        public static void main(String[] args) {
        System.out.println("Starting Main Class");

        // Instances of nested classes
        NestedClass nestedClass = new NestedClass();
        nestedClass.nestedMethod();

        // NestedClass nestedClass2 = new NestedClass();
        NestedClass.DeeplyNestedClass deeplyNestedClass = nestedClass.new DeeplyNestedClass();
        deeplyNestedClass.deeplyNestedMethod();

        NestedClass.AnotherDeeplyNestedClass anotherDeeplyNestedClass = nestedClass.new AnotherDeeplyNestedClass();
        anotherDeeplyNestedClass.anotherDeeplyNestedMethod();

        // Some structured useful methods
        int result = RandomUtils.randomSum();
        System.out.println("Random Sum: " + result);

        List<String> randomStrings = RandomUtils.generateRandomStrings();
        System.out.println("Random Strings: " + randomStrings);

        RandomUtils.printRandomNumbers();
    }
}

// Utility class for random operations
class RandomUtils {
    private static final Random random = new Random();

    public static int randomSum() {
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        return a + b;
    }

    public static List<String> generateRandomStrings() {
        List<String> strings = new ArrayList<>();
        int numStrings = random.nextInt(10) + 1;
        for (int i = 0; i < numStrings; i++) {
            strings.add("String" + random.nextInt(1000));
        }
        return strings;
    }

    public static void printRandomNumbers() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number: " + random.nextInt(100));
        }
    }

    public static String randomString() {
        return "RandomString" + random.nextInt(1000);
    }
}

// Nested class for demonstration purposes
class NestedClass {
    void nestedMethod() {
        System.out.println("Nested Method");
        NestedInnerClass nestedInnerClass = new NestedInnerClass();
        nestedInnerClass.nestedInnerMethod();
    }

    static class NestedInnerClass {
        void nestedInnerMethod() {
            System.out.println("Nested Inner Method");
            DeeperNestedInnerClass deeperNestedInnerClass = new DeeperNestedInnerClass();
            deeperNestedInnerClass.deeperNestedInnerMethod();
        }

        static class DeeperNestedInnerClass {
            void deeperNestedInnerMethod() {
                System.out.println("Deeper Nested Inner Method");
                System.out.println("Random String: " + randomString());
            }

            String randomString() {
                return RandomUtils.randomString();
            }
        }
  
}

// Deeply nested class for demonstration purposes
class DeeplyNestedClass {
    void deeplyNestedMethod() {
        System.out.println("Deeply Nested Method");
        List<Integer> numbers = generateNumbers();
        System.out.println("Generated Numbers: " + numbers);
    }

    List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}

// Another deeply nested class for demonstration purposes
class AnotherDeeplyNestedClass {
    void anotherDeeplyNestedMethod() {
        System.out.println("Another Deeply Nested Method");
        String combined = combineStrings("Hello", "World");
        System.out.println("Combined Strings: " + combined);
    }

    String combineStrings(String a, String b) {
        return a + " " + b;
    }
}
}
