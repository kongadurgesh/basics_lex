package utility;

public class FunCalculator {
    public boolean isArmStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp /= 10;
        }
        return sum == number;
    }
}
