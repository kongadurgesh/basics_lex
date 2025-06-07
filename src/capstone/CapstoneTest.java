package capstone;

public class CapstoneTest {
    public static void main(String[] args) {
        RoomDetails details = new RoomDetails("Durgesh", "Standard", 2, 10);
        float totalBill = details.calculateBill();
        System.out.println("Bill Id:" + details.getBillId());
        System.out.println("Customer Name: " + details.getCustomerName());
        System.out.println("No. of days Stay: " + details.getNoofDaysStay());
        System.out.println("Total Bill: " + totalBill);

    }
}
