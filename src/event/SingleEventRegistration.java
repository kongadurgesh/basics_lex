package event;

public class SingleEventRegistration extends EventRegistration {

    private int participantNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        super.registerEvent();
        System.out.println(
                "Thank You " + getName() + " for your participation. Your registration fee is: "
                        + getRegistrationFee());
        System.out.println("You are participant no: " + getParticipantNo());
    }

}
