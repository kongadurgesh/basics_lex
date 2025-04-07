package entity;

public interface PriceCalculator {
    public double getTax();

    public double getDiscount();

    public double calculateFinalPrice();
}
