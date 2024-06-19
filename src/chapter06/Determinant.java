/**
* Show matrix diagonals and determinant 
* Author: Phil
*/

import java.util.Scanner;


/*---------------------------------------*/
public class Determinant
{
    /*---------------------------------------*/
    public static void main(String[] args)
    {
        var in = new Scanner(System.in);

        System.out.print("** enter the num. of columns: ");
        int col = in.nextInt();

        System.out.print("** enter the num. of rows: ");
        int row = in.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; ++i) 
        {
            System.out.print("** enter values for row " + (i+1) + ": ");

            String[] snums = new Scanner(System.in).nextLine().trim().split(" ");
            for (int j = 0; j < col; ++j) {
                matrix[i][j] = Integer.parseInt(snums[j]);
            }
        }

        System.out.println("\n** matrix:");
        Determinant.print(matrix);

        Determinant.diag(matrix);
    }

    /*---------------------------------------*/
    private static void print(int[][] mx)
    {
        for (int i = 0; i < mx.length; ++i) 
        {
            for (int j = 0; j < mx[i].length; ++j) {
                System.out.printf("| %02d ", mx[i][j]);
            }

            System.out.println("|");
        }
    }

    /*---------------------------------------*/
    private static void diag(int[][] mx)
    {
        if (mx.length != mx[0].length) {
            System.out.print("\n** no diags!");
            return;
        }

        int det = 1;

        System.out.print("\n** diag 1: ");
        for (int i = 0; i < mx.length; ++i) {
            int n = mx[i][i];
            det *= n;
            System.out.printf("%02d ", n);
        }

        System.out.print("\n** diag 2: ");
        int mul = 1;
        for (int i = 0, k = mx.length-1; i < mx.length; ++i, --k) {
            int n = mx[i][k];
            mul *= n;
            System.out.printf("%02d ", n);
        }

        det -= mul;
        System.out.println("\n** determinant: " + det);
    }
}