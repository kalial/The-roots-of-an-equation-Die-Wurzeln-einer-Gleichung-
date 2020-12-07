import java.util.Scanner;

/*
The for-loop  The roots of an equation (Die Wurzeln einer Gleichung)
The roots of a cubic equation
Your task is to find the roots of a cubic equation.
Given the numbers a, b, c, d Output in ascending order all the integers between 0 and 1000 which are the roots of the equation ax^3+bx^2+cx+d == 0.
If the specified interval does not contain the roots of the equation, do not output anything.
Remember, that cubic equation always has 3 roots. Keep this in mind in order to optimize the code.
Sample Input 1:
-1
1
-1
1
Sample Output 1:
1
Sample Input 2:
0
1
-6
5
Sample Output 2:
1
5
Sample Input 3:
1
1
1
1
Sample Output 3:

 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        for (int x = 0; x <= 1000; x++) {
            if (a * Math.pow(x, 3) + b* Math.pow(x, 2) + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}
