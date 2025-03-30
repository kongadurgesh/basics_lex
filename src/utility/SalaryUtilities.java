package utility;

public class SalaryUtilities {
    public double calculateAverageSalary(double[] salaries) {
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        return sum / salaries.length;
    }

    public int getCountLessSalaryThanAverage(double[] salaries, double averageSalary) {
        int count = 0;
        for (double salary : salaries) {
            if (salary < averageSalary) {
                count++;
            }
        }
        return count;
    }

    public int getCountGreaterSalaryThanAverage(double[] salaries, double averageSalary) {
        int count = 0;
        for (double salary : salaries) {
            if (salary > averageSalary) {
                count++;
            }
        }
        return count;
    }
}
