package entity;

import java.util.Scanner;

public class Calculator {
    public static Scanner scanner = new Scanner(System.in);

    public void calculateCircleArea() {
        System.out.println("Enter radius of the Circle");
        double radius = scanner.nextDouble();
        System.out.println("Area of the Circle");
        System.out.println((Math.PI * radius * radius));
    }

    public void calculateTriangleArea() {
        System.out.println("Enter the base of Traingle");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of Triangle");
        double height = scanner.nextDouble();
        System.out.println("Area of the Triangle");
        System.out.println(0.5 * base * height);
    }

    public void calculateConeArea() {
        System.out.println("Enter the base of Cone");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of Cone");
        double height = scanner.nextDouble();
        System.out.println("Area of the Triangle");
        System.out.println(Math.PI * base * height);
    }

    public void calculateSquareArea() {
        System.out.println("Enter side of the Sqaure");
        double radius = scanner.nextDouble();
        System.out.println("Area of the Square");
        System.out.println((radius * radius));
    }

    public static void testCalculate() {
        System.out.println("1. Circle, 2. Sqaure, 3. Traingle, 4. Cone");
        Calculator calculator = new Calculator();
        int option = scanner.nextInt();
        if (option == 1) {
            calculator.calculateCircleArea();
        } else if (option == 2) {
            calculator.calculateSquareArea();
        } else if (option == 3) {
            calculator.calculateTriangleArea();
        } else {
            calculator.calculateConeArea();
        }
    }
}
