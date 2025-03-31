package entity;

public class Customer implements AfterSale {
    public double calculatePurchaseAmount() {
        return 100;
    }

    @Override
    public double chargeOnDelivery() {
        return 15;
    }

    public double getBill() {
        return calculatePurchaseAmount() + chargeOnDelivery();
    }
}
