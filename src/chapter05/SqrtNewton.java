/**
* Author: Philippe Matias
*/

import java.util.Scanner;


public class SqrtNewton
{
    //---------------------------------------------------
    private static final double EPSILON = 0.00001;

    //---------------------------------------------------
    public static void main(String[] args)
    {
        System.out.print("** enter a real number: ");
        double num = new Scanner(System.in).nextDouble();

        System.out.printf("** the square root of %.2f is abrox. %.3f\n", num, SqrtNewton.sqrt(num));
    }

    //---------------------------------------------------
    public static double sqrt(double n)
    {
        double root = n/2.0; //first guess

        while (Math.abs(root*root - n) >= SqrtNewton.EPSILON) {
            root  -=  ((root*root) - n) / (2.0 * root);
        }

        return root;
    }
}
