package entity;

public class RegularCustomer extends Customer {

    @Override
    public double chargeOnDelivery() {
        return 15;
    }

}
