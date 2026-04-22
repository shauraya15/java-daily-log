/*
Problem: Count Digits in a Number


Approach:
- Keep dividing number by 10
- Count how many times it happens until number becomes 0

*/

public class Q6_CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Number of digits = " + count);
    }
}