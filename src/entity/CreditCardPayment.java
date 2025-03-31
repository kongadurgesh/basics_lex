package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardPayment extends RRPaymentServices {
    private static int counter = 0;
    private String paymentID;
    private double cashBack;
    private double balanceDue;

    public CreditCardPayment(double balance, int customerID) {
        super(balance, customerID);
        setBalanceDue(balance);
        setPaymentID("C" + (int) (1000 + ++counter));
    }

    @Override
    public void payBill(double billAmount) {
        Pattern pattern = Pattern.compile("^C\\d{4}$");
        Matcher matcher = pattern.matcher(paymentID);
        if (matcher.matches()) {
            if (balanceDue < billAmount) {
                setCashBack(billAmount - balanceDue);

                System.out.println("Congratulations!! You have successfully made a payment of Rs." + billAmount
                        + ". Payment details are: ");
                System.out
                        .println("**********************************************************************************");
                System.out.println("Customer ID: " + getCustomerID());
                System.out.println("Payment ID: " + getPaymentID());
                System.out.println("Previous Due: Rs." + balanceDue);
                setBalanceDue(0);
                System.out.println("Remaining Due: Rs." + getBalanceDue());
                System.out.println("Cashback wallet Balance : Rs." + getCashBack());
            } else if (balanceDue > billAmount) {
                System.out.println("Congratulations!! You have successfully made a payment of Rs." + billAmount
                        + ". Payment details are: ");
                System.out
                        .println("**********************************************************************************");
                System.out.println("Customer ID: " + getCustomerID());
                System.out.println("Payment ID: " + getPaymentID());
                System.out.println("Previous Due: Rs." + balanceDue);
                setBalanceDue(balanceDue - billAmount);
                System.out.println("Remaining Due: Rs." + getBalanceDue());
                System.out.println("Cashback wallet Balance : Rs." + getCashBack());
            }
        }
    }

    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }

}
