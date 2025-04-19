package entity;

public class Football {
    private String leagueName = "EPL";
    private String coachName = "Hugo";

    private class Player {
        private String playerName = "Kevin";
        private long phoneNumber = 123;

        private void printLeagueDetails() {
            System.out.println(leagueName);
            System.out.println(coachName);
        }
    }

    public void printDetails() {
        Player player = new Player();
        player.printLeagueDetails();
        System.out.println(player.playerName);
        System.out.println(player.phoneNumber);
    }
}
