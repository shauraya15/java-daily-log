/*

Pattern:
1
21
321
4321

Approach:
- Outer loop controls rows
- Inner loop runs from current row number down to 1
*/

public class Q7_NumberPattern4 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}