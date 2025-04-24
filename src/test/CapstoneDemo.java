package test;

import entity.Calculator;

public class CapstoneDemo {
    public static void question1() {
        int[] message = { 74, 97, 118, 97, 32, 105, 115, 32, 103, 114, 101, 97, 116 };

        StringBuffer buffer = new StringBuffer();
        for (int i : message) {
            buffer.append((char) i);
        }
        System.out.println(buffer.toString());
    }

    public static void question2() {
        Calculator.testCalculate();
    }

    public static void question3() {
    }
}
