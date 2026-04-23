/*
Problem: Electricity Bill Calculator
*/

public class Q4_ElectricityBillCalculator {
    public static void main(String[] args) {
        int units = 180;
        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 5.0);
        }

        System.out.println("Electricity Bill = " + bill);
    }
}