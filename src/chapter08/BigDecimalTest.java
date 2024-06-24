/**
* Us of class BigDeciml
* Author: Phil
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;


public class BigDecimalTest
{
    public static void main(String[] args)
    {
        var in = new Scanner(System.in);

        System.out.print("** digite um valor monetario: ");
        var money = BigDecimal.valueOf(in.nextDouble());

        System.out.print("** digite um desconto em %: ");
        var discount = BigDecimal.valueOf(in.nextDouble()/100.0);

        var discounted = money.subtract(money.multiply(discount));

        System.out.printf("** valor com desconto: $%.2f\n", discounted);
    }
}
