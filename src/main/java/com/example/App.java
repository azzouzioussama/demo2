package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        System.out.println("Starting Main Class");
        
        // Instances of nested classes
        NestedClass nestedClass = new NestedClass();
        nestedClass.nestedMethod();
        
        DeeplyNestedClass deeplyNestedClass = new DeeplyNestedClass();
        deeplyNestedClass.deeplyNestedMethod();
        
        AnotherDeeplyNestedClass anotherDeeplyNestedClass = new AnotherDeeplyNestedClass();
        anotherDeeplyNestedClass.anotherDeeplyNestedMethod();
        
        // Some unstructured useful methods
        int result = randomSum();
        System.out.println("Random Sum: " + result);
        
        List<String> randomStrings = generateRandomStrings();
        System.out.println("Random Strings: " + randomStrings);
        
        printRandomNumbers();
    }

    // Unstructured useful method to generate a random sum
    public static int randomSum() {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        return a + b;
    }

    // Unstructured useful method to generate a list of random strings
    public static List<String> generateRandomStrings() {
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        int numStrings = random.nextInt(10) + 1;
        for (int i = 0; i < numStrings; i++) {
            strings.add("String" + random.nextInt(1000));
        }
        return strings;
    }

    // Unstructured useful method to print random numbers
    public static void printRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number: " + random.nextInt(100));
        }
    }

    static class NestedClass {
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

                // Unstructured useful method to generate a random string
                public String randomString() {
                    Random random = new Random();
                    return "RandomString" + random.nextInt(1000);
                }
            }
        }
    }

    static class DeeplyNestedClass {
        void deeplyNestedMethod() {
            System.out.println("Deeply Nested Method");
            List<Integer> numbers = generateNumbers();
            System.out.println("Generated Numbers: " + numbers);
        }

        // Unstructured useful method to generate a list of numbers
        public List<Integer> generateNumbers() {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i);
            }
            return numbers;
        }
    }

    static class AnotherDeeplyNestedClass {
        void anotherDeeplyNestedMethod() {
            System.out.println("Another Deeply Nested Method");
            String combined = combineStrings("Hello", "World");
            System.out.println("Combined Strings: " + combined);
        }

        // Unstructured useful method to combine two strings
        public String combineStrings(String a, String b) {
            return a + " " + b;
        }
    }
}
