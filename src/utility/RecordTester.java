package utility;

public class RecordTester {
    public void testRecord() {
        Customer customer = new Customer(101, "Abhi",
                "abhi@gmail.com", "Patna");
        System.out.println(customer.discount());
    }
}
