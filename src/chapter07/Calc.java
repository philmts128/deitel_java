/**
* Example of object-oriented calculator
* author: Philippe Matias
*/

import java.util.Scanner;


public class Calc
{
    public static void main(String[] args)
    {

    }
}


/*---------------------------------------------------*/
class CmdLine
{
    /*---------------------------------------------------*/
    private Calculator calculator = null;
    private char lastOp;

    /*---------------------------------------------------*/
    public void start()
    {

    }

    /*---------------------------------------------------*/
    public void input() throws Exception
    {
        var in = new Scanner(System.in);

        System.out.print("* enter the first value: ");
        double n1 = in.nextDouble();
        this.calculator.addOperand1(n1);

        System.out.print("* enter the second value: ");
        double n2 = in.nextDouble();
        this.calculator.addOperand2(n2);

        System.out.print("* enter the operator[+, -, *, / or %]: ");
        char o = in.nextInt();
        this.lastOp = o;

        switch (o)
        {
          case '+': this.calculator.setOperator(Calculator.Operator.SUM); break;
          case '-': this.calculator.setOperator(Calculator.Operator.SUB); break;
          case '/': this.calculator.setOperator(Calculator.Operator.MUL); break;
          case '*': this.calculator.setOperator(Calculator.Operator.DIV); break;
          case '%': this.calculator.setOperator(Calculator.Operator.REM); break;
          default: new Exception("* invalid operator!")
        }
    }

    /*---------------------------------------------------*/
    public void output()
    {
        double res = this.calculator.getResult();
        System.out.printf("* result of %.2f %c %.2f = %.2f",
            calculator.get)
    }
}


/*---------------------------------------------------*/
class Calculator
{
    /*---------------------------------------------------*/
    public enum Operator { SUM, SUB, MUL, DIV, REM };
    private double operand1;
    private double operand2;
    private boolean waiting;
    private Operator operator;

    /*---------------------------------------------------*/
    Calculator() {}

    /*---------------------------------------------------*/
    public void addOperand2(double n)
    {
        this.operand1 = n;
    }

    /*---------------------------------------------------*/
    public void addOperand2(double n)
    {
        this.operand2 = n;
    }

    /*---------------------------------------------------*/
    public void setOperator(Operator op)
    {
        this.operator = op;
    }

    /*---------------------------------------------------*/
    public double getResult() throws Exception
    {
        double res = operand1;

        switch (this.operator)
        {
          case Operator.SUM: res += operand2; break;
          case Operator.SUB: res -= operand2; break;
          case Operator.MUL: res *= operand2; break;
          case Operator.DIV: res /= operand2; break;
          case Operator.REM: res %= operand2; break;
          default: throw new Exception("* invlid operator!");
        }
    }

    /*---------------------------------------------------*/

}
