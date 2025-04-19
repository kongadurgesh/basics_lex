package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class CustomerTester {
    private static final Logger LOGGER = Logger.getLogger(CustomerTester.class.getName());

    public void testCustomer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "London", 123456));
        customers.add(new Customer("Henry", "New York", 321456));
        customers.add(new Customer("Ronald", "London", 123456));
        customers.add(new Customer("Arnold", "Paris", 987654));
        // iterate over the list and display customer details
        for (Customer customer : customers) {
            LOGGER.info(customer.toString());
        }
        Customer bob = new Customer("Bob", "London", 123456);
        System.out.println(bob.toString());
        int count = 0;
        // logic to check how many customers are there with same pin code as of Bob
        for (Customer customer : customers) {
            System.out.println(customer.hasSamePincode(bob));
            if (customer.hasSamePincode(bob)) {
                System.out.println("count incremented");
                count++;
            }
        }
        LOGGER.info("Count of customers with same pin code as of Bob: " + count);
    }

    public void testMap() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "London", 123456));
        customers.add(new Customer("Henry", "New York", 321456));
        customers.add(new Customer("Ronald", "London", 123456));
        customers.add(new Customer("Arnold", "Paris", 987654));
        // map to store city, and number of customers in each city
        Map<String, Integer> cityCustomerCountMap = new ConcurrentHashMap<>();
        // logic to calculate number of customers in each city
        for (Customer customer : customers) {
            if (cityCustomerCountMap.containsKey(customer.getCity())) {
                cityCustomerCountMap.put(customer.getCity(), cityCustomerCountMap.get(customer.getCity()) + 1);
            } else
                cityCustomerCountMap.put(customer.getCity(), 1);
        }
        LOGGER.info(cityCustomerCountMap.toString());

        // logic to delete the entries in the map where the number of customers in the
        // city is not more than one
        Iterator<String> mapIterator = cityCustomerCountMap.keySet().iterator();

        while (mapIterator.hasNext()) {
            String key = mapIterator.next();

            if (cityCustomerCountMap.get(key) > 1)
                cityCustomerCountMap.remove(key);
        }

        LOGGER.info(cityCustomerCountMap.toString());
    }
}
