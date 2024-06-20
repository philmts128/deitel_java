/**
* Author: Phil
*/


import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class DynamicArray
{
    public static void main(String[] args)
    {
        var in = new Scanner(System.in);
        var countries = new ArrayList<String>();

        System.out.print("\n| enter country names[del. by |]: ");
        String[] c = in.nextLine().trim().split("\\|");
        for (String ic : c)
            countries.add(ic.trim());

        System.out.print("| do you wanna remove some? ");
        String rc = new Scanner(System.in).nextLine().trim();

        if (!rc.equals("") && countries.contains(rc)) 
            countries.remove(rc);

        Collections.sort(countries);

        System.out.println("** ordered list: ");
        for (String s : countries)
            System.out.printf("| %s\n", s);
    }
}