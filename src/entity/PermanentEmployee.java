package entity;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        setSalary(getVariablePay() + getBasicPay() + getHra());
    }

    private double getVariablePay() {
        if (experience < 3) {
            return 0;
        } else if (experience < 5) {
            return 0.05 * basicPay;
        } else if (experience < 10) {
            return 0.07 * basicPay;
        } else {
            return 0.12 * basicPay;
        }
    }
}
