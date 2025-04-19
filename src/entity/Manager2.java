package entity;

interface Grade {
    char grades = 'A';

    public char calculateGrade(String employeeID, int point);
}

public class Manager2 {
    Grade grade = new Grade() {
        private char grade;

        @Override
        public char calculateGrade(String employeeID, int point) {
            if (point < 100 && point >= 90) {
                grade = 'A';
            } else if (point < 90 && point >= 80) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            return grade;
        }

    };

    public char checkEmployeeID(String employeeID, int point) {
        return grade.calculateGrade(employeeID, point);
    }
}
