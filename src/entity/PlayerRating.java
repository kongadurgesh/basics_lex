package entity;

public class PlayerRating {
    private int playerPosition;
    private String playerName;
    // private float criticOneRating;
    // private float criticTwoRating;
    // private float criticThreeRating;
    private float averageRating;
    private char category;

    public PlayerRating(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
        this.averageRating = (criticOneRating + criticTwoRating) / 2;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        this.averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
    }

    public void calculateCategory() {
        if (averageRating > 8) {
            category = 'A';
        } else if (averageRating > 5) {
            category = 'B';
        } else if (averageRating > 0) {
            category = 'C';
        }
    }

    public void display() {
        System.out.println("The player name is " + playerName);
        System.out.println("The player position is " + playerPosition);
        System.out.printf("The average rating is %.2f", averageRating);
        System.out.println("\n The category is " + category);
    }
}
