/**
Exercício Java
Autor: Phil
*/

import java.util.Scanner;

public class RightTriangle
{
    public static void main(String[] args)
    {
        System.out.print("| enter the height: ");
        int h = new Scanner(System.in).nextInt();

        if (h <= 0) {
            System.out.println("| invalid input!");
            System.exit(0);
        }

        int k = 1;
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < k; ++j) {
                System.out.print("*");
            }

            k += 1;
            System.out.println("");
        }
    }
}
