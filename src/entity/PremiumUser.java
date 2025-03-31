package entity;

public class PremiumUser extends User {
    private int rewardPoints;

    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
        setRewardPoints(0);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public boolean makePayment(double billAmount) {
        if (super.makePayment(billAmount)) {
            setRewardPoints(getRewardPoints() + (int) (0.1 * billAmount));
            return true;
        } else {
            return false;
        }
    }
}
