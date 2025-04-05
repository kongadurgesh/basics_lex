package student;

enum GRADE {
    A, B, C, D, E

}

public class Student {
    private int studentId;
    private String name;
    private GRADE grade;
    private int scholarshipAmount;
    private int totalMarks;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public GRADE getGrade() {
        return grade;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void calculateGrade() {
        int totalMarks = getTotalMarks();
        if (totalMarks >= 250)
            grade = GRADE.A;
        else if (totalMarks >= 200 && totalMarks < 250)
            grade = GRADE.B;
        else if (totalMarks >= 175 && totalMarks < 200)
            grade = GRADE.C;
        else if (totalMarks >= 150 && totalMarks < 175)
            grade = GRADE.D;
        else
            grade = GRADE.E;
    }

    public void calculateScholarshipAmount() {
        switch (grade) {
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
        }
    }

    public String display() {
        return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + ", scholarshipAmount="
                + scholarshipAmount + ", totalMarks=" + totalMarks + "]";
    }

}
