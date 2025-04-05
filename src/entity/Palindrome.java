package entity;

public class Palindrome {
    public void checkPalindrome(int number) {
        String numString = String.valueOf(number);
        String revString = new StringBuilder(numString).reverse().toString();
        if (numString.equals(revString)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }
    }
}
