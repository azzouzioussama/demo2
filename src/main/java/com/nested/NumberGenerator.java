package com.nested;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    public static List<Integer> generateNumbers(int numNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numNumbers; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
