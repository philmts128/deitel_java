/**
* Chpter 4
* Author: Philippe
*/

import java.util.Scanner;


public class Count
{
    public static void main(String[] args)
    {
        System.out.print("| enter an integer: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println("| Ascending\tDescending");
        for (int i = 0; i <= num; ++i) {
            System.out.printf("| %d\t\t%d\n", i, (num-i));
        }
    }
}
