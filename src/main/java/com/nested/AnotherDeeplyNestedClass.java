package com.nested;

public class AnotherDeeplyNestedClass {
    public void anotherDeeplyNestedMethod() {
        System.out.println("Another Deeply Nested Method");
        String combined = StringCombiner.combineStrings("Hello", "World");
        System.out.println("Combined Strings: " + combined);
    }
}
