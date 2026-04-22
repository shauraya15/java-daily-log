/*
Problem: Palindrome Number
Approach:
- Reverse the number
- Compare reversed number with original number
*/

public class Q2_PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (original == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}