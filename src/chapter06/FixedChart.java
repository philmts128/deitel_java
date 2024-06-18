/**
 * Random generated chart
 * Author: Philippe Matias
 */

 import java.util.Scanner;
 import java.security.SecureRandom;
 import java.util.Arrays; 

 public class FixedChart
 {
    public static void main(String[] args)
    {
        var scan = new Scanner(System.in);

        System.out.print("| enter the min range: ");
        int min = scan.nextInt();

        System.out.print("| enter the min range: ");
        int max = scan.nextInt();

        System.out.print(" enter how many integers: ");
        int amount = scan.nextInt();

        var gen = new Generator(amount, min, max);
        gen.start();
        gen.print();
    }
 }


 /*---------------------------------------------------*/
 class Generator
 {
    /*---------------------------------------------------*/
    private int m_amount;
    private int m_min;
    private int m_max;
    private int[] m_nums = null;

    /*---------------------------------------------------*/
    public Generator(int amount, int min, int max)
    {
        m_amount = amount;
        m_min = min;
        m_max = max;
        m_nums = new int[amount];

        int range = (max - min) + 1;
        if (amount > range) amount = range;
    }

    /*---------------------------------------------------*/
    public void start()
    {
        var rnd = new SecureRandom();
        for (int i = 0; i < m_nums.length; ++i)
            m_nums[i] = rnd.nextInt(m_max+1-m_min) + m_min;
        Arrays.sort(m_nums);
    }

    /*---------------------------------------------------*/
     public void print()
     {
        var dupAux = new int[m_amount];
        int z = 0;

       for (int i = 0; i < m_nums.length; ++i) 
       {
            if (this.exists(dupAux, m_nums[i]))
                continue;

            System.out.printf("%2d - ", m_nums[i]);
            int c = this.count(m_nums[i]);
            for (int k = 0; k < c; ++k) {
                System.out.print("*");
            }

            System.out.println("");

            dupAux[z] = m_nums[i]; ++z;
       }
    }

    /*---------------------------------------------------*/
    private int count(int num)
    {
        int c = 0;
        for (int i : m_nums)
            if (i == num) ++c;
        return c;
    }

    /*---------------------------------------------------*/
    private boolean exists(int[] nums, int n)
    {
        for (int i : nums) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
 }