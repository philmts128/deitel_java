/**
* author: Phil M
*/

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivZero
{
    public static void main(String[] args)
    {
        try
        {
            var in = new Scanner(System.in);

            System.out.print("* enter a number: ");
            int n1 = in.nextInt();

            System.out.print("* enter another number: ");
            int n2 = in.nextInt();

            System.out.printf("* division: %d\n", DivZero.div(n1, n2));
        }
        catch (ArithmeticException e)
        {
            System.err.println("* division by zero!");
        }
        catch (InputMismatchException e)
        {
            System.err.println("* invalid input!");
        }
        finally
        {
            System.out.println("* this is the end");
        }
    }

    public static int div(int n1, int n2)
    {
        return n1 / n2;
    }
}
