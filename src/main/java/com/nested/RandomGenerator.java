package com.nested;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private static final Random random = new Random();

    public static int generateRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static String generateRandomString() {
        return "RandomString" + generateRandomInt(1000);
    }

    public static List<String> generateRandomStrings(int numStrings) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            strings.add(generateRandomString());
        }
        return strings;
    }
}