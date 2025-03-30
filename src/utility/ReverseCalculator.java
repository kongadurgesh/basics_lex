package utility;

public class ReverseCalculator {
    public int reverseNumberUsingWhile(int number) {
        int reverse = 0;
        int temp = number;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        return reverse;
    }

    public int reverseNumberUsingFor(int number) {
        int reverse = 0;

        for (int temp = number; temp > 0; temp /= 10) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
        }
        return reverse;
    }

    public int reverseNumberUsingDoWhile(int number) {
        int reverse = 0;
        int temp = number;
        do {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        } while (temp > 0);
        return reverse;
    }
}
