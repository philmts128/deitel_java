/**
* Chpter 4
* Author: Philippe
*/

import java.util.Scanner;


public class Word
{
    public static void main(String[] args)
    {
        System.out.print("** enter a text: ");
        String txt = new Scanner(System.in).nextLine();

        System.out.printf("** the inverse of \'%s\' is \'%s\'\n", txt, Word.inverse(txt));

        if (Word.palindrome(txt)) {
            System.out.printf("** \'%s\' is palindrome!\n", txt);
        } else {
            System.out.printf("** \'%s\' is not palindrome!\n", txt);
        }
    }

    private static String inverse(String str)
    {
        var len = str.length();
        var chars = new char[len];

        for (int i = len-1; i >= 0; --i) {
            chars[(len-1)-i] = str.charAt(i);
        }

        return new String(chars);
    }

    private static boolean palindrome(String str)
    {
        for (int i = 0; i < (str.length()-1)/2; ++i) {
            if (str.charAt(i) != str.charAt((str.length()-1) - i)) {
                return false;
            }
        }

        return true;
    }
}
