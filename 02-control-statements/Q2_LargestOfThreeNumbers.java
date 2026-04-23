/*
Problem: Largest of Three Numbers

*/

public class Q2_LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 45, b = 78, c = 62;

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }
    }
}