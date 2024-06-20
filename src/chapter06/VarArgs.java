/**
* Author: Phil
*/


import java.util.Scanner;


public class VarArgs
{
    public static void main(String[] args)
    {
        VarArgs.hello("Philippe", "Matias");
    }

    public static void hello(String... name)
    {
        System.out.print("| hello, ");
        for (var s : name)
            System.out.print(s + " ");
        System.out.println(" :) \n");
    }
}