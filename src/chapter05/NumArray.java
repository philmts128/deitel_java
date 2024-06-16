/**
* Author: Philippe Matias
*/

import java.util.Scanner;
import java.util.ArrayList;


//---------------------------------------------------
public class NumArray
{
    //---------------------------------------------------
    private ArrayList<Integer> m_integers = new ArrayList<>();
    private IntsInfo m_info = new IntsInfo();

    //---------------------------------------------------
    public static void main(String[] args)
    {
        var na = new NumArray();

        na.readInts();
        na.getNumInfo();
        na.output();
    }

    //---------------------------------------------------
    private void readInts()
    {
        System.out.print("| enter a sequence of integers: ");
        String[] ints = new Scanner(System.in).nextLine().trim().split(" ");

        for (String n : ints)
            m_integers.add(Integer.parseInt(n));
    }

    //---------------------------------------------------
    private void output()
    {
        System.out.printf("| min: %d\n",         m_info.min);
        System.out.printf("| max: %d\n",         m_info.max);
        System.out.printf("| sum: %d\n",         m_info.sum);
        System.out.printf("| average: %.2f\n\n", m_info.average);
    }

    //---------------------------------------------------
    private IntsInfo getNumInfo()
    {
        var i = m_info;

        i.min = m_integers.get(0);
        i.max = m_integers.get(0);
        i.sum = m_integers.get(0);

        for (int k = 1; k < m_integers.size(); ++k) {
            if (m_integers.get(k) <= i.min) i.min = m_integers.get(k);
            if (m_integers.get(k) >= i.max) i.max = m_integers.get(k);
            i.sum += m_integers.get(k);
        }

        i.average = (double)(i.sum) / (double)(m_integers.size());
        return i;
    }
}


//---------------------------------------------------
public class IntsInfo
{
    public double average;
    public int min;
    public int max;
    public int sum;
}
