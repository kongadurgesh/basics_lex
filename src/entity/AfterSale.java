package entity;

public interface AfterSale {
    double chargeOnDelivery();

    default double calculateDiscount(double billAmount) {
        return 0.95 * billAmount;
    }
}
