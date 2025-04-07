package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class Customer {
    private String id;
    private String name;
    private String city;
    private Integer pincode;
    private static final Logger LOGGER = Logger.getLogger(Customer.class.getName());

    // parameterized constructor
    public Customer(String name, String city, Integer pincode) {
        this.name = name;
        this.city = city;
        this.pincode = pincode;

        generateId(); // generateId() method is called to generate a unique id for the customer
    }

    // getter and setter methods for all the fields
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    /**
     * An utility method to generate a unique id for the customer
     * 
     * @return returns nothing
     */
    private void generateId() {
        this.id = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dMMyyhhmmss"));
        this.id = this.id + name.length() + city.length();
        // LOGGER.info("Generated customer id for customer: " + this.name + " is: " +
        // this.id);
    }

    /**
     * This method checks if the pin code of two customers is same
     * 
     * @return true if the pin code matches otherwise returns false
     */
    public boolean hasSamePincode(Customer customer) {
        LOGGER.info("hasSamePincode method is called with pin codes: " + this.pincode + " and " + customer.pincode);

        return customer.getPincode().equals(this.getPincode());
    }

    /**
     * This is the overridden toString() method to display Customer object data
     * 
     * @return a string representation of the Customer object
     */
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
    }
}
