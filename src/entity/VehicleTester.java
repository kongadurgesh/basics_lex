package entity;

public class VehicleTester {
    public void testVehicle() {
        Vehicle vehicle_1 = new Vehicle("Wrangler", "FourWheeler", 1000000);
        System.out.println("Model: " + vehicle_1.modelName());
        System.out.println("Final Price: " + vehicle_1.calculateFinalPrice());

        Vehicle vehicle_2 = new Vehicle("Nexon", "FourWheeler", 1100000);
        System.out.println("Model: " + vehicle_2.modelName());
        System.out.println("Final Price: " + vehicle_2.calculateFinalPrice());

        Vehicle vehicle_3 = new Vehicle("Pulsar", "TwoWheeler", 100000);
        System.out.println("Model: " + vehicle_3.modelName());
        System.out.println("Final Price: " + vehicle_3.calculateFinalPrice());
    }
}
