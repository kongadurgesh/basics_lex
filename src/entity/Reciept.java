package entity;

public class Reciept {
    private int billId;
    private int customerId;
    private int discount;
    private double billAmount;

    public Reciept(int billId, int customerId, int discount, double billAmount) {
        this.billId = billId;
        this.customerId = customerId;
        this.discount = discount;
        this.billAmount = billAmount;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double calculateDiscountedBillAmount() {
        double discountedBill = 0f;
        discountedBill = billAmount - billAmount * ((double) discount / 100);
        return discountedBill;
    }
}
