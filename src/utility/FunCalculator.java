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

    public boolean isLucky(int number) {
        int sum = 0;
        String numberString = Integer.toString(number);
        for (int i = 1; i < numberString.length(); i += 2) {
            int t = Character.getNumericValue(numberString.charAt(i));
            sum = sum + (t * t);
        }
        return sum % 9 == 0;
    }
}
