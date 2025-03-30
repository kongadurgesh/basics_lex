import java.util.Scanner;

import entity.Car;
import entity.Chocolate;
import entity.Point;
import entity.Reciept;
import entity.Rectangle;
import entity.Student;
import utility.EnhancedFor;
import utility.FunCalculator;
import utility.ReverseCalculator;
import utility.SalaryUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        int value = 11;
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
            case 8:
                enhancedFor();
                break;
            case 9:
                salaryComparisions();
                break;
            case 10:
                createRectangle();
                break;
            case 11:
                createChocolate();
                break;
            default:
                break;
        }
    }

    private static void createChocolate() {
        Chocolate chocolate_1 = new Chocolate();
        chocolate_1.setBarCode(101);
        chocolate_1.setName("Cadbury");
        chocolate_1.setWeight(12);
        chocolate_1.setCost(10);

        Chocolate chocolate_2 = new Chocolate();
        chocolate_2.setBarCode(102);
        chocolate_2.setName("Hershey's");
        chocolate_2.setWeight(24);
        chocolate_2.setCost(50);

        Chocolate chocolate_3 = new Chocolate(101, "Cadbury", 12, 10);

        System.out.println(chocolate_1);
        System.out.println(chocolate_2);
        System.out.println(chocolate_3);
    }

    private static void createRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setBreadth(5);
        System.out.println(rectangle.toString());
    }

    private static void salaryComparisions() {
        SalaryUtilities salaryUtilities = new SalaryUtilities();
        double salaries[] = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double averageSalary = salaryUtilities.calculateAverageSalary(salaries);
        System.out.println("The average salary of the employee is : " + averageSalary);
        int countOfSalariesGreaterThanAverage = salaryUtilities.getCountGreaterSalaryThanAverage(salaries,
                averageSalary);
        System.out.println("The number of employees having salary greater than the average is : "
                + countOfSalariesGreaterThanAverage);
        int countOfSalariesLessThanAverage = salaryUtilities.getCountLessSalaryThanAverage(salaries, averageSalary);
        System.out.println(
                "The number of employees having salary lesser than the average is : " + countOfSalariesLessThanAverage);
    }

    private static void enhancedFor() {
        EnhancedFor enhancedFor = new EnhancedFor();
        enhancedFor.storeMarks(100);
        enhancedFor.storeMarks(200);
        enhancedFor.storeMarks(12);
        enhancedFor.storeMarks(123);
        enhancedFor.storeMarks(1234);
        enhancedFor.displayMarks();
    }

    private static void checkArmstrongOrLuckyNumber() {
        System.out.println("Enter the Choice, 1: Armstong , 2: Lucky");
        Scanner inp = new Scanner(System.in);
        int choice = inp.nextInt();
        FunCalculator calculator = new FunCalculator();
        switch (choice) {
            case 1:
                System.out.print("Enter a number to Check Armstrong: ");
                int number = inp.nextInt();
                if (calculator.isArmStrong(number)) {
                    System.out.println("The number " + number + " is an Armstrong number");
                } else {
                    System.out.println("The number " + number + " is not an Armstrong number");
                }
                break;
            case 2:
                System.out.print("Enter a number to Check Lucky: ");
                number = inp.nextInt();
                if (calculator.isLucky(number)) {
                    System.out.println("The number " + number + " is a lucky number");
                } else {
                    System.out.println("The number " + number + " is not a lucky number");
                }
                break;
            default:
                System.out.println("Oops! Invalid Choice!");
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
