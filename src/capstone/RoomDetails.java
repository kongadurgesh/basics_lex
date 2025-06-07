package capstone;

public class RoomDetails implements RoomBillComponent {

    private int billId;
    private String customerName;
    private String typeOfRoom;
    private int noOfExtraPersons;
    private int noofDaysOfStay;
    private static int counter = 100;

    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noofDaysOfStay) {
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPersons = noOfExtraPersons;
        this.noofDaysOfStay = noofDaysOfStay;
    }

    public int getBillId() {
        return billId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getNoOfExtraPersons() {
        return noOfExtraPersons;
    }

    public int getNoofDaysStay() {
        return noofDaysOfStay;
    }

    public static int getCounter() {
        return ++counter;
    }

    public boolean validateNoOfDaysOfStay() {
        return (noofDaysOfStay >= 1 && noofDaysOfStay <= 15) ? true : false;
    }

    public boolean validateNoOfExtraPersons() {
        return (noOfExtraPersons > 2) ? false : true;
    }

    public boolean validateTypeOfRoom() {
        if (typeOfRoom.equals("Standard") || typeOfRoom.equals("Deluxe") || typeOfRoom.equals("Cottage")) {
            return true;
        }
        return false;
    }

    @Override
    public float calculateBill() {
        if (validateNoOfDaysOfStay() && validateNoOfExtraPersons() && validateTypeOfRoom()) {
            billId = getCounter();
            float baseRoomFare = typeOfRoom.equals("Standard") ? 2500 : typeOfRoom.equals("Deluxe") ? 3500 : 5500;

            double totalBill = (noofDaysOfStay * baseRoomFare) + (noofDaysOfStay * FOOD_CHARGE)
                    + (EXTRA_PERSON_CHARGE * noOfExtraPersons);
            totalBill = totalBill + totalBill * TAX / 100;
            return (float) totalBill;
        }
        return 0;
    }

}
