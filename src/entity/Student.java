package entity;

public class Student {
    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;
    private final int STIPEND = 0;
    private int aggregateMarks;

    public double calculateTotalStipend() {
        if (aggregateMarks >= 95) {
            return 120;
        } else if (aggregateMarks >= 90) {
            return 115;
        } else if (aggregateMarks >= 85) {
            return 110;
        } else {
            return 100;
        }
    }

    public int getStipend() {
        return STIPEND;
    }

    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public int getYearOfEngg() {
        return yearOfEngg;
    }

    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", qualifyingExamMarks=" + qualifyingExamMarks
                + ", residentialStatus=" + residentialStatus + ", yearOfEngg=" + yearOfEngg + "]";
    }

}
