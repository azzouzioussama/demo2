package com.example;
import java.util.List;

import com.nested.*;

public class App_ref2 {
    public static void main(String[] args) {
        System.out.println("Starting Main Class");

        NestedClass nestedClass = new NestedClass();
        nestedClass.nestedMethod();

        DeeplyNestedClass deeplyNestedClass = new DeeplyNestedClass();
        deeplyNestedClass.deeplyNestedMethod();

        AnotherDeeplyNestedClass anotherDeeplyNestedClass = new AnotherDeeplyNestedClass();
        anotherDeeplyNestedClass.anotherDeeplyNestedMethod();

        int result = RandomGenerator.generateRandomInt(100) + RandomGenerator.generateRandomInt(100);
        System.out.println("Random Sum: " + result);

        List<String> randomStrings = RandomGenerator.generateRandomStrings(5);
        System.out.println("Random Strings: " + randomStrings);

        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number: " + RandomGenerator.generateRandomInt(100));
        }
    }

}
