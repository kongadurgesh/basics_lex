package entity;

public class PrivilegedCustomer extends Customer {

    @Override
    public double getBill() {
        return calculateDiscount(super.getBill());
    }

}
