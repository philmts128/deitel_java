/**
* Simulate the rolls of a dice 
* Author: Phil
*/


import java.util.Scanner;
import java.security.SecureRandom;


public class DiceRoll
{
    public static void main(String[] args)
    {
        final int SIDES = 6;
        var dice = new int[SIDES];
        var rnd = new SecureRandom();

        System.out.print("** enter how many rolls: ");
        int rolls = new Scanner(System.in).nextInt();

        for (int i = 0; i < rolls; ++i) {
            dice[rnd.nextInt(SIDES)] += 1;
        }

        System.out.println("Face\tFrequency\tPercent");
        for (int i = 1; i <= SIDES; ++i) {
            double pc = ((double)dice[i-1] / (double)rolls) * 100.0;
            System.out.printf("%d\t%d\t\t%.2f%%\n", i, dice[i-1], pc);
        }
    }
}