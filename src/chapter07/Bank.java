/*
 * simple class example
 * author: Philippe Matias 
 */

 import java.util.Scanner;


/*-------------------------------------------*/
public class Bank
{
    private BankAccount account = null;

    /*-------------------------------------------*/
    public static void main(String[] args)
    {
        var ba = new Bank();
        ba.start();
    }

    /*-------------------------------------------*/
    public void start()
    {
        var in = new Scanner(System.in);

        try
        {
            System.out.print("| enter your name: ");
            String name = in.nextLine().trim();

            System.out.print("| enter how much money: ");
            double cash = in.nextDouble();

            account = new BankAccount(name, cash);

            this.askCustomer();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /*-------------------------------------------*/
    private void askCustomer() throws Exception
    {
        while (true)
        {
            System.out.print("| enter add or get and amount of cash[-1 to end]: ");
            String[] arg = new Scanner(System.in).nextLine().trim().split(" ");

            if (arg[0].equals("-1")) {
                System.out.printf("| bye, %s\n", this.account.getName());
                System.exit(0);
            }

            String n = arg[0].toLowerCase();
            double c = Double.parseDouble(arg[1]);

            if (n.equals("add")) {
                this.account.addCash(c);
                this.printData();
            } else if (n.equals("get")) {
                this.account.getCash(c);
                this.printData();
            } else {
                System.out.println("| invalid option.");
            }
        }
    }

    /*-------------------------------------------*/
    private void printData()
    {
        System.out.printf("| name: %s\n", this.account.getName());
        System.out.printf("| cash: %.2f\n", this.account.getCashAmount());
    }
}


/*-------------------------------------------*/
class BankAccount
{
    private String name;
    private double cash;

    /*-------------------------------------------*/
    BankAccount() {}

    /*-------------------------------------------*/
    BankAccount(String name, double cash)
    {
        this.name = name;
        this.cash = cash;
    }

    /*-------------------------------------------*/
    public void addCash(double amount)
    {
        this.cash += amount;
    }

    /*-------------------------------------------*/
    public void getCash(double amount) throws Exception
    {
        if (amount > this.cash) {
            throw new Exception("This amount is begger than you have.");
        }

        if (this.cash <= 0) {
            throw new Exception("You don't have enough debit.");
        }

        this.cash -= amount;
    }

    /*-------------------------------------------*/
    public String getName()         { return this.name; }
    public double getCashAmount()    { return this.cash; }
}
