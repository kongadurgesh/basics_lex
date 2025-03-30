package entity;

public class Car {
    private int speedInKmph;
    private int timeInMinutes;

    public Car(int speedInKmph, int timeInMinutes) {
        this.speedInKmph = speedInKmph;
        this.timeInMinutes = timeInMinutes;
    }

    public int getSpeedInKmph() {
        return speedInKmph;
    }

    public void setSpeedInKmph(int speedInKmph) {
        this.speedInKmph = speedInKmph;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public float calculateDistance() {
        float distance = 0f;
        float time = (float) this.timeInMinutes / 60;
        distance = (float) speedInKmph * time;
        return distance;
    }
}
