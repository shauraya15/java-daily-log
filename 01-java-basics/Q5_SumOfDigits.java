/*
Problem: Sum of Digits

Approach:
- Extract each digit using % 10
- Add it to sum
- Remove last digit using / 10
*/

public class Q5_SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}