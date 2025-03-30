package event;

public class EventRegistration {
    private String name;
    private String nameOfEvent;
    private double registrationFee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public void registerEvent() {
        if (this.getNameOfEvent().equals("ShakeALeg"))
            this.setRegistrationFee(100d);
        else if (getNameOfEvent().equals("Sing&Win"))
            this.setRegistrationFee(150d);
        else if (getNameOfEvent().equals("Actathon"))
            this.setRegistrationFee(70d);
        else if (getNameOfEvent().equals("PlayAway"))
            this.setRegistrationFee(130d);
    }
}
