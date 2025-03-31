package entity;

public abstract class RRPaymentServices {
    private double balance;
    private int customerID;

    public RRPaymentServices(double balance, int customerID) {
        this.balance = balance;
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void payBill(double billAmount);
}
