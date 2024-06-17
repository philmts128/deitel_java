/**
* Author: Phil
*/


import java.util.Scanner;


public class NumGenerator
{
    public static void main(String[] args)
    {
        String[] nums = {"zero",  "um",   "dois", "tres", "quatro",
                         "cinco", "seis", "sete", "oito", "nove", "dez"};

        var in = new Scanner(System.in);

        System.out.print("| digite numeros naturais[ex 1 2 3]: ");
        while (in.hasNext())
        {
            int n = in.nextInt();

            if (n >= 0 && n <= 9)
                System.out.printf("** %s\n", nums[n]);
            else
                System.out.println("** outro");
        }
    }
}
