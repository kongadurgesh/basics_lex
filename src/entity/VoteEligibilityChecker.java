package entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VoteEligibilityChecker {
    public void checkVoteEligibility() {
        System.out.println("Enter you DOB in dd-mm-yyyy format");
        Scanner inp = new Scanner(System.in);
        String dob = inp.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        Period age = Period.between(dateOfBirth, LocalDate.now());
        Period remainingAge = Period.between(LocalDate.now(), dateOfBirth.plusYears(18));
        if (age.getYears() >= 18) {
            System.out.println("You are eligible to Vote");
        } else {
            System.out.println("you will be eligible to vote in " + remainingAge.getYears() + " years, "
                    + remainingAge.getMonths() + " months, " + remainingAge.getDays() + " days.");
        }
        inp.close();

    }
}
