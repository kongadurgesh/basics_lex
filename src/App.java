import java.util.Scanner;

import entity.Car;
import entity.Point;
import entity.Reciept;
import entity.Student;
import utility.FunCalculator;
import utility.ReverseCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        int value = 7;
        switch (value) {
            case 1:
                executeStudentProgram();
                break;
            case 2:
                executePointProgram();
                break;
            case 3:
                calculateWithOperators();
                break;
            case 4:
                calculateDistance();
                break;
            case 5:
                calculateDiscountedBillAmount();
                break;
            case 6:
                calculateReverses();
                break;
            case 7:
                checkArmstrongOrLuckyNumber();
                break;
            default:
                break;
        }
    }

    private static void checkArmstrongOrLuckyNumber() {
        System.out.println("Enter the Choice, 1: Armstong , 2: Lucky");
        Scanner inp = new Scanner(System.in);
        int choice = inp.nextInt();
        FunCalculator calculator = new FunCalculator();
        switch (choice) {
            case 1:
                System.out.print("Enetr a number to Check Armstrong: ");
                int number = inp.nextInt();
                if (calculator.isArmStrong(number)) {
                    System.out.println("The number " + number + " is an Armstrong number");
                } else {
                    System.out.println("The number " + number + " is not an Armstrong number");
                }
                break;

            default:
                break;
        }
        inp.close();
    }

    private static void calculateReverses() {
        ReverseCalculator calculator = new ReverseCalculator();
        int number = 27;
        System.out.println("The reverse of the number using while is: " + calculator.reverseNumberUsingWhile(number));
        System.out.println("The reverse of the number using for is: " + calculator.reverseNumberUsingFor(number));
        System.out.println(
                "The reverse of the number using do while is: " + calculator.reverseNumberUsingDoWhile(number));

    }

    private static void calculateDiscountedBillAmount() {
        Reciept reciept1 = new Reciept(1001, 101, 2, 199.99d);
        Reciept reciept2 = new Reciept(1002, 102, 4, 210.5d);

        System.out.println("Discount bill of Reciept 1: " + reciept1.calculateDiscountedBillAmount());
        System.out.println("Discount bill of Reciept 2: " + reciept2.calculateDiscountedBillAmount());
    }

    private static void calculateDistance() {
        Car car = new Car(90, 100);
        System.out.println(car.calculateDistance());
    }

    private static void calculateWithOperators() {
        int res = 1 + 2;
        System.out.println(res);
        res = res - 1;
        System.out.println(res);
        res = res * 2;
        System.out.println(res);
        res = res / 2;
        System.out.println(res);
        res = res + 8;
        res = res % 7;
        System.out.println(res);
    }

    private static void executePointProgram() {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(0, 0);
        float distance = p1.distance(p2);
        System.out.println("Distance between points: " + distance);
        Point p3 = new Point(3, 2);
        Point p4 = new Point(-5, 7);
        distance = p3.distance(p4);
        System.out.println("Distacne between p3 and p4: " + distance);
    }

    private static void executeStudentProgram() {
        Student student = new Student();
        student.setStudentId(1);
        student.setName("John Doe");
        student.setQualifyingExamMarks(85.5f);
        student.setResidentialStatus('Y');
        student.setYearOfEngg(2023);

        System.out.println(student.toString());
    }
}
