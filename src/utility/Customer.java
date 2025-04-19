package utility;

public record Customer(int customerId, String customerName, String customerEmail, String customerAddress)
        implements sales {

    private static int discount = 10;

    @Override
    public int discount() {
        System.out.println("Inside discount");
        return discount;
    }

}
