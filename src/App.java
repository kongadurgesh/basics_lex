import java.util.Scanner;

import com.infy.scannerdemo.ScannerDemo;

import entity.Car;
import entity.Chocolate;
import entity.ContractEmployee;
import entity.CreditCardPayment;
import entity.DataProvider;
import entity.EmployeeTester;
import entity.Intern;
import entity.Loan;
import entity.LocalDateAndTime;
import entity.LocationChanger;
import entity.Palindrome;
import entity.PermanentEmployee;
import entity.PlayerRating;
import entity.Point;
import entity.PremiumUser;
import entity.PrivilegedCustomer;
import entity.RRPaymentServices;
import entity.Reciept;
import entity.Rectangle;
import entity.Registration;
import entity.RegularCustomer;
import entity.ShoppingPayment;
import entity.Student;
import entity.StudentRegistration;
import entity.TimeZoneTest;
import entity.Trainee;
import entity.TryMathCube;
import entity.User;
import entity.VoteEligibilityChecker;
import entity.ZoneTimeTest;
import event.SingleEventRegistration;
import event.TeamEventRegistration;
import sealed.CocoaPowder;
import sealed.DarkChocolate;
import sealed.WhiteChocolate;
import utility.EnhancedFor;
import utility.FunCalculator;
import utility.ListTester;
import utility.LoggingTest;
import utility.MapTester;
import utility.ReverseCalculator;
import utility.SalaryUtilities;
import utility.SetTester;
import utility.SortTest;

public class App {
    private static void testFinalStipend() {
        Student student_1 = new Student();
        student_1.setStudentId(1212);
        student_1.setAggregateMarks(93);
        double totalStipend = student_1.calculateTotalStipend();
        System.out.println("The final stipend of " + student_1.getStudentId() + " is $" + totalStipend);
        Student student2 = new Student();
        student2.setStudentId(1222);
        student2.setAggregateMarks(84);
        totalStipend = student2.calculateTotalStipend();
        System.out.println("The final stipend of " + student2.getStudentId() + " is $" + totalStipend);
    }

    private static void testRRPayments() {
        RRPaymentServices paymentServices_1 = new ShoppingPayment(5000.0, 561328);
        paymentServices_1.payBill(5000);

        RRPaymentServices paymentServices_2 = new ShoppingPayment(5000, 561328);
        paymentServices_2.payBill(6000);

        RRPaymentServices paymentServices_3 = new ShoppingPayment(5000, 561328);
        paymentServices_3.payBill(4000);

        RRPaymentServices paymentServices_4 = new CreditCardPayment(10000.23, 5001);
        paymentServices_4.payBill(15000);

        RRPaymentServices paymentServices_5 = new CreditCardPayment(10000.23, 5001);
        paymentServices_5.payBill(0);

        RRPaymentServices paymentServices_6 = new CreditCardPayment(10000.23, 5001);
        paymentServices_6.payBill(5000);
    }

    private static void testInterfacePercentage() {
        DataProvider provider_1 = new Intern(5000, 500);
        provider_1.calcPercentage();
        DataProvider provider_2 = new Trainee(6000);
        provider_2.calcPercentage();
        DataProvider provider_3 = new Intern(8000, 500);
        provider_3.calcPercentage();
    }

    private static void testEnum() {
        student.Student student_1 = new student.Student();
        student_1.setStudentId(1000);
        student_1.setName("Alvin");
        student_1.setTotalMarks(280);
        student_1.calculateGrade();
        student_1.calculateScholarshipAmount();
        System.out.println(student_1.display());
    }

    private static void testObject() {
        StudentRegistration registration_1 = new StudentRegistration("peter", 23, 5001);
        StudentRegistration registration_2 = new StudentRegistration("Peter", 24, 5001);
        if (registration_2.equals(registration_1)) {
            System.out.println("Roll number already generated for the student!");
        } else {
            registration_2.generateRollNumber();
            System.out.println("Student Details");
            System.out.println("**********************************");
            System.out.println("Student Name               :" + registration_2.getStudentName());
            System.out.println("Admission Number           :" + registration_2.getAdmissionNumber());
            System.out.println("Roll Number                :" + registration_2.getRollNo());
        }
    }

    private static void testStringChange() {
        LocationChanger changer = new LocationChanger();
        changer.setName("Annabelle Michael");
        changer.setLocation("BL003, Delhi, STP");
        changer.welcomeEmployee();
        changer.checkCity();
        changer.editAddress();
    }

    private static void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(123431);
    }

    private static void testLocaldateAndTime() {
        LocalDateAndTime localDateAndTime = new LocalDateAndTime();
        localDateAndTime.testLocaldateAndTime();
    }

    private static void testVoteEligible() {
        VoteEligibilityChecker checker = new VoteEligibilityChecker();
        checker.checkVoteEligibility();
    }

    private static void testZoneTime() {
        ZoneTimeTest test = new ZoneTimeTest();
        test.testZoneTime();
    }

    private static void testTimes() {
        TimeZoneTest test = new TimeZoneTest();
        test.calculateTimes();
    }

    private static void testTryCatch() {
        TryMathCube cube = new TryMathCube();
        cube.test();
    }

    private static void testEmployeeException() {
        EmployeeTester employeeTester = new EmployeeTester();
        employeeTester.testEmployee();
    }

    private static void testLoggingTest() {
        LoggingTest loggingTest = new LoggingTest();
        System.out.println(loggingTest.divide(5.0f, 0f));
    }

    private static void testList() {
        ListTester listTester = new ListTester();
        // listTester.testList();
        listTester.listTest();
    }

    private static void testSet() {
        SetTester setTester = new SetTester();
        // setTester.testSet();
        setTester.testStudentsSet();
    }

    private static void testMap() {
        MapTester mapTester = new MapTester();
        // mapTester.testMap();
        mapTester.testStudentsMap();
    }

    private static void testSort() {
        SortTest sortTest = new SortTest();
        sortTest.testSortTest();
    }

    public static void main(String[] args) throws Exception {
        int value = 38;
        switch (value) {
            case 38:
                testSort();
                break;
            case 37:
                testMap();
                break;
            case 36:
                testSet();
                break;
            case 35:
                testList();
                break;
            case 34:
                testLoggingTest();
                break;
            case 33:
                testEmployeeException();
                break;
            case 32:
                testTryCatch();
                break;
            case 31:
                testTimes();
                break;
            case 30:
                testZoneTime();
                break;
            case 29:
                testVoteEligible();
                break;
            case 28:
                testLocaldateAndTime();
                break;
            case 27:
                testPalindrome();
                break;
            case 26:
                testStringChange();
                break;
            case 25:
                testObject();
                break;
            case 24:
                testEnum();
                break;
            case 23:
                testSealedClasses();
                break;
            case 22:
                testInterfaceSaleApplication();
                break;
            case 21:
                testInterfacePercentage();
                break;
            case 20:
                testRRPayments();
                break;
            case 19:
                testFinalStipend();
                break;
            case 18:
                testUserPayment();
                break;
            case 17:
                testPlayerRating();
                break;
            case 16:
                createRegistration();
                break;
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
            case 12:
                testScanner();
                break;
            case 13:
                testLoanApp();
                break;
            case 14:
                testEventRegistration();
                break;
            case 15:
                testEmployeeInheritance();
                break;
            default:
                break;
        }
    }

    private static void testSealedClasses() {
        CocoaPowder chocolate_1 = new CocoaPowder();
        chocolate_1.display();
        WhiteChocolate chocolate_2 = new WhiteChocolate();
        chocolate_2.display();
        DarkChocolate chocolate_3 = new DarkChocolate();
        chocolate_3.display();
    }

    private static void testInterfaceSaleApplication() {
        RegularCustomer customer_1 = new RegularCustomer();
        System.out.println("bill for customer_1 is: "
                + customer_1.getBill());
        PrivilegedCustomer customer_2 = new PrivilegedCustomer();
        System.out.println("bill for customer_2 is: " + customer_2.getBill());
    }

    private static void testUserPayment() {
        User user_1 = new User(101, "Joe", "joe@abc.com", 100);
        boolean paymentStatus = user_1.makePayment(70);
        if (paymentStatus) {
            System.out.println("Congratulations " + user_1.getUserName() + ", payment of $70.0 was successful!");
            System.out.println("Your wallet balance is $" + user_1.getWalletBalance());
        }
        PremiumUser user_2 = new PremiumUser(201, "Jill", "jill@abc.com", 300);
        paymentStatus = user_2.makePayment(150);
        if (paymentStatus) {
            System.out.println("Congratulations " + user_2.getUserName() + ", payment of $150.0 was successful!");
            System.out.println("Your wallet balance is $" + user_2.getWalletBalance());
            System.out.println("You have " + user_2.getRewardPoints() + " points!");
        }
        paymentStatus = user_2.makePayment(80);
        if (paymentStatus) {
            System.out.println("Congratulations " + user_2.getUserName() + ", payment of $80.0 was successful!");
            System.out.println("Your wallet balance is $" + user_2.getWalletBalance());
            System.out.println("You have " + user_2.getRewardPoints() + " points!");
        }
        paymentStatus = user_2.makePayment(120);
        if (paymentStatus) {
            System.out.println("Congratulations " + user_2.getUserName() + ", payment of $120.0 was successful!");
            System.out.println("Your wallet balance is $" + user_2.getWalletBalance());
            System.out.println("You have " + user_2.getRewardPoints() + " points!");
        } else {
            System.out.println("Sorry " + user_2.getUserName() + ", you do not have enough balance to pay the bill!");
            System.out.println("Your wallet balance is $" + user_2.getWalletBalance());
            System.out.println("You have " + user_2.getRewardPoints() + " points!");
        }
    }

    private static void testPlayerRating() {
        PlayerRating playerRating_1 = new PlayerRating(1, "Beckham");
        playerRating_1.calculateAverageRating(9f, 9.9f);
        playerRating_1.calculateCategory();
        playerRating_1.display();

        PlayerRating playerRating_2 = new PlayerRating(1, "Oscar");
        playerRating_2.calculateAverageRating(1, 1, 1);
        playerRating_2.calculateCategory();
        playerRating_2.display();
    }

    private static void createRegistration() {
        Registration registration_1 = new Registration("Kevin", "MN9891N", new long[] { 9452425421L, 7676765252L });
        System.out.println("Congratulations " + registration_1.getCustomerName()
                + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Passport number: " + registration_1.getPassportNo());
        System.out.print("Phone numbers: ");
        long[] phoneNos = registration_1.getTelephoneNo();
        for (long phoneNo : phoneNos) {
            System.out.println(phoneNo);
        }
        Registration registration_2 = new Registration("Julias",
                123, "PN7878", new long[] { 2345615451L,
                        6763562562L });
        System.out.println("Congratulations " + registration_2.getCustomerName()
                + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Pan card number: " + registration_2.getPanCardNo());
        System.out.print("Phone numbers: ");
        phoneNos = registration_2.getTelephoneNo();
        for (long phoneNo : phoneNos) {
            System.out.println(phoneNo);
        }
        Registration registration_3 = new Registration("Jammy", 45453, 765, new long[] { 9634524353L,
                9887373737L });
        System.out.println("Congratulations " + registration_3.getCustomerName()
                + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Voter id: " + registration_3.getVoterId());
        System.out.println("License Number: " + registration_3.getLicenseNo());
        System.out.print("Phone numbers: ");
        phoneNos = registration_2.getTelephoneNo();
        for (long phoneNo : phoneNos) {
            System.out.println(phoneNo);
        }
        Registration registration_4 = new Registration("Rose", "PN8934", 34356, new long[] { 9867456367L,
                7645367356L });
        System.out.println("Congratulations " + registration_4.getCustomerName()
                + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Pan card Number: " + registration_4.getPanCardNo());
        System.out.println("Voter id: " + registration_4.getVoterId());
        System.out.print("Phone numbers: ");
        phoneNos = registration_2.getTelephoneNo();
        for (long phoneNo : phoneNos) {
            System.out.println(phoneNo);
        }
    }

    private static void testEmployeeInheritance() {
        PermanentEmployee employee_1 = new PermanentEmployee();
        employee_1.setName("Anil");
        employee_1.setEmpId(101);
        employee_1.setBasicPay(10000);
        employee_1.setHra(1500);
        employee_1.setExperience(3);
        employee_1.calculateSalary();
        System.out.println("Permanent Employee: Your salary is: " + employee_1.getSalary());

        ContractEmployee employee_2 = new ContractEmployee();
        employee_2.setName("Ankit");
        employee_2.setEmpId(102);
        employee_2.setWages(500);
        employee_2.setHours(10);
        employee_2.calculateSalary();
        System.out.println("Contract Employee: Your salary is: " + employee_2.getSalary());
    }

    private static void testEventRegistration() {
        SingleEventRegistration registration_1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        registration_1.registerEvent();
        TeamEventRegistration registration_3 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
        registration_3.registerEvent();
        SingleEventRegistration registration_2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        registration_2.registerEvent();

    }

    private static void testLoanApp() {
        Loan loan_1 = new Loan();
        Loan loan_2 = new Loan(123, 456, 789, 10000, 10, 8f);
        System.out.println("Loan Counter of Loan 1: " + loan_1.getLoanCounter());
        System.out.println("Loan Counter of Loan 2: " + loan_2.getLoanCounter());
    }

    private static void testScanner() {
        ScannerDemo scannerDemo = new ScannerDemo();
        scannerDemo.testScanner();
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
