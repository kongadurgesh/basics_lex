package entity;

public record Vehicle(String modelName, String type, double basicPrice) implements PriceCalculator {

    @Override
    public double calculateFinalPrice() {
        return basicPrice + getTax() - getDiscount();
    }

    @Override
    public double getDiscount() {
        double totalPrice = basicPrice + getTax();
        if (totalPrice > 2000000) {
            return 0.04 * totalPrice;
        }
        if (totalPrice > 1000000) {
            return 0.03 * totalPrice;
        }
        if (totalPrice > 500000) {
            return 0.02 * totalPrice;
        }
        if (totalPrice > 100000) {
            return 0.01 * totalPrice;
        }
        return 0.00 * totalPrice;

    }

    @Override
    public double getTax() {
        return type() == "TwoWheeler" ? 0.08 * basicPrice() : 0.09 * basicPrice();
    }

}
