package entity;

public class StudentRegistration {
    private String studentName;
    private double age;
    private int admissionNumber;
    private int rollNo;
    private static int counter = 1000;

    public StudentRegistration(String studentName, double age, int admissionNumber) {
        this.studentName = studentName;
        this.age = age;
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAge() {
        return age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void generateRollNumber() {

        rollNo = ++counter;
    }

    @Override
    public int hashCode() {
        return admissionNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
