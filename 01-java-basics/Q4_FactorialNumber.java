/*
Problem: Factorial of a Number


Approach:
- Use loop from 1 to n
- Multiply factorial step by step

*/

public class Q4_FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}