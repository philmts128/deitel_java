/**
Exercício Java
Autor: Phil
*/

import java.util.Scanner;

public class SquareCube
{
    public static void main(String[] args)
    {
        System.out.print("| enter a positive integer: ");
        int num = new Scanner(System.in).nextInt();

        if (num <= 0) {
            System.out.println("| invalid input!");
            System.exit(0);
        }

        System.out.println("Num.\tSquare\tCube\t");
        for (int i = 1; i <= num; ++i)
            System.out.printf("%d\t%d\t%d\n", i, (i*i), (i*i*i));

    }
}
