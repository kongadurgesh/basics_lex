package entity;

public class Intern implements DataProvider {
    private int marksSecured;
    private int graceMarks;

    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    @Override
    public void calcPercentage() {
        double totalMarksSecured = (double) (marksSecured + graceMarks);
        if (totalMaximumMarks < totalMarksSecured) {
            System.out.println("Please enter the correct marks");
            return;
        }
        double percentage = totalMarksSecured * 100 / totalMaximumMarks;
        System.out.printf("the total aggregate percentage secured is %.2f\n", percentage);
    }

}
