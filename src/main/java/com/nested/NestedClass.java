package com.nested;

public class NestedClass {
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
                System.out.println("Random String: " + RandomGenerator.generateRandomString());
            }
        }
    }
}

