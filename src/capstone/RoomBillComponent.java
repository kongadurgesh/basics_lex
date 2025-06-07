package capstone;

public interface RoomBillComponent {
    public static final double TAX = 12;
    public static final double EXTRA_PERSON_CHARGE = 500;
    public static final double FOOD_CHARGE = 800;

    float calculateBill();
}
