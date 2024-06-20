package com.nested;

import java.util.List;

public class DeeplyNestedClass {
    public void deeplyNestedMethod() {
        System.out.println("Deeply Nested Method");
        List<Integer> numbers = NumberGenerator.generateNumbers(5);
        System.out.println("Generated Numbers: " + numbers);
    }
}
