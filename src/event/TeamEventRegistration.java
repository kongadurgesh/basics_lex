package event;

public class TeamEventRegistration extends EventRegistration {
    private int noOfParticipants;
    private int teamNo;

    public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
        super(name, nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    @Override
    public void registerEvent() {
        if (this.getNameOfEvent().equals("ShakeALeg"))
            this.setRegistrationFee(50);
        else if (getNameOfEvent().equals("Sing&Win"))
            this.setRegistrationFee(60);
        else if (getNameOfEvent().equals("Actathon"))
            this.setRegistrationFee(80);
        else if (getNameOfEvent().equals("PlayAway"))
            this.setRegistrationFee(100);
        setRegistrationFee(super.getRegistrationFee() * getNoOfParticipants());
        System.out.println(
                "Thank You " + getName() + " for your participation.Your registration fee is: " + getRegistrationFee());
        System.out.println("You are participant no: " + getTeamNo());
    }

}
