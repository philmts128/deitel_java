/**
* Example of object-oriented calculator
* author: Philippe Matias
*/

import java.util.Scanner;


public class Calc
{
    public static void main(String[] args)
    {
        var cmd = new CmdLine();
        cmd.start();
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
        try
        {
            this.calculator = new Calculator();
            this.input();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
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
        char o = new Scanner(System.in).nextLine().charAt(0);
        this.lastOp = o;
        this.calculator.setOperator(this.charToOp(o));

        this.output();
    }

    /*---------------------------------------------------*/
    public void output()
    {
        try
        {
        double res = this.calculator.getResult();
        System.out.printf("* result of %.2f %c %.2f = %.2f",
            calculator.getOperand1(),
            lastOp,
            calculator.getOperand2(),
            res);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /*---------------------------------------------------*/
    private Calculator.Operator charToOp(char o) 
    {
        switch (o)
        {
          case '+': return Calculator.Operator.SUM;
          case '-': return Calculator.Operator.SUB;
          case '*': return Calculator.Operator.SUB;
          case '/': return Calculator.Operator.DIV;
          case '%': return Calculator.Operator.REM;
          default:  return Calculator.Operator.NONE;
        }
    }

    /*---------------------------------------------------*/
    private char opToChar(Calculator.Operator o) 
    {
        switch (o)
        {
          case Calculator.Operator.SUM: return '+';
          case Calculator.Operator.SUB: return '-';
          case Calculator.Operator.MUL: return '*';
          case Calculator.Operator.DIV: return '/';
          case Calculator.Operator.REM: return '%';
          default:  return ' ';
        }
    }
}


/*---------------------------------------------------*/
class Calculator
{
    /*---------------------------------------------------*/
    public enum Operator { SUM, SUB, MUL, DIV, REM, NONE };
    private double operand1;
    private double operand2;
    private boolean waiting;
    private Operator operator;

    /*---------------------------------------------------*/
    Calculator() {}

    /*---------------------------------------------------*/
    public void addOperand1(double n)
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

        return res;
    }

    /*---------------------------------------------------*/
    public double   getOperand1() { return this.operand1; }
    public double   getOperand2() { return this.operand2; }
    public Operator getOperator() { return this.operator; }
}
