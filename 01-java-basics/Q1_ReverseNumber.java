/*
Problem: Reverse Number

Approach:
- Extract last digit using % 10
- Build reversed number using rev = rev * 10 + digit
- Remove last digit using / 10
*/

public class Q1_ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + rev);
    }
}