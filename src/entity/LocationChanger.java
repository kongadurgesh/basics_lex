package entity;

import java.util.Scanner;

public class LocationChanger {
    private String location;
    private String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkCity() {
        if (location.contains("Delhi")) {
            System.out.println("Welcome to Infy Mysore Delhites!");
        } else if (location.contains("Trivandrum")) {
            System.out.println("Welcome to MyDC people of Trinfy!");
        } else if (location.contains("Bhubaneshwar")) {
            System.out.println("You came a long way down South! We welcome you!");
        } else {
            System.out.println("Oops your city name is not listed!");
        }

        if (location.contains("STP")) {
            System.out.println("Your location has been changed from STP to SEZ.");
        } else {
            System.out.println("Your location remains the same!");
        }
    }

    public void editAddress() {
        System.out.println("Enter Address to Update:");
        Scanner inp = new Scanner(System.in);
        location = inp.nextLine();
        inp.close();
        System.out.println("Address is updated: ");
        System.out.println("Updated Address: " + location);
    }

    public void welcomeEmployee() {
        System.out.println("Hello " + name.split(" ")[0]);
    }
}
