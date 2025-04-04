package entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VoteEligibilityChecker {
    public void checkVoteEligibility() {
        System.out.println("Enter you DOB in mm-dd-yyyy format");
        Scanner inp = new Scanner(System.in);
        String dob = inp.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        if (age >= 18) {
            System.out.println("You are eligible to Vote");
        } else {
            
        }
        inp.close();

    }
}
