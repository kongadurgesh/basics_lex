package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoppingPayment extends RRPaymentServices {
    private static int counter = 0;
    private String paymentID;

    public ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);
        counter++;
        setPaymentID();
    }

    @Override
    public void payBill(double billAmount) {
        Pattern pattern = Pattern.compile("^S\\d{4}$");
        Matcher matcher = pattern.matcher(paymentID);
        if (matcher.matches()) {
            if (billAmount < getBalance()) {
                System.out.println("Insufficient amount entered!! Please try again");
            } else if (billAmount > getBalance()) {
                System.out.println("Excess amount entered!! Please try again.");
            } else {
                setPaymentID();
                System.out.println("Congratulations!! Your payment of Rs" + billAmount
                        + " is successful with payment id " + paymentID + ".");
            }
        } else {
            System.out.println("Invalid Payment ID");
        }
    }

    public void setPaymentID() {
        paymentID = "S" + (1000 + counter);
    }

    public String getPaymentID() {
        return paymentID;
    }

    public static int getCounter() {
        return counter;
    }

}
