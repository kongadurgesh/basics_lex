package entity;

public class Trainee implements DataProvider {
    private int marksSecured;

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    @Override
    public void calcPercentage() {
        if (marksSecured > totalMaximumMarks) {
            System.out.println("Please enter the correct marks");
            return;
        }
        System.out.printf("the total aggregate percentage secured is %.2f\n",
                (double) (marksSecured * 100) / totalMaximumMarks);
    }

}
