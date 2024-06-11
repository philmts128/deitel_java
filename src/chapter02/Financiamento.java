/*
 Clone da calculadora de juros pra Android.
 Author: Philippe
*/

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;


public class Financiamento 
{
    //-----------------------------------------------------
    Scanner m_scan = new Scanner(System.in);
    boolean m_running = true;

    //-----------------------------------------------------
    public static void main(String[] args)
    {
        var fn = new Financiamento();
        fn.loop();
    }

    //-----------------------------------------------------
    public void loop()
    {
        while (m_running)
            this.mainMenu();
    }

    //-----------------------------------------------------
    public void mainMenu()
    {
        try {
            this.logo();

            System.out.println("\n| escolha uma opção:\n");
            System.out.println("1. Aplicação");
            System.out.println("2. Financiamento");
            System.out.println("3. Valor Futuro");
            System.out.println("4. Correção de Valores");
            System.out.println("5. Sair");

            System.out.print("\n>> ");
            int opt = m_scan.nextInt();

            switch(opt)
            {
                case 1:
                    this.financingMenu(true, "valor acumulado + juros",
                        (p, t, r) -> Financiamento.annuity(p, t, r));
                    break;

                case 2:
                    this.financingMenu(true, "Valor da parcela",
                        (p, t, r) -> Financiamento.financing(p, t, r));
                    break;

                case 3:
                    this.financingMenu(true, "Valor do capital + juros",
                        (p, t, r) -> Financiamento.future(p, t, r));
                    break;

                case 4: break;
                case 5: m_running = false; break;
                default: throw new Exception("");
            }
        } catch (Exception e) {
            this.errorMsg("");
        }
    }

    //-----------------------------------------------------
    private void financingMenu(boolean shwLogo, String outMsg, Formula formula)
    {
        if (shwLogo) this.logo();

        try
        {
            var scan = new Scanner(System.in);

            System.out.println("\n*-------------------------------------------*");

            System.out.print("| digite o valor: ");
            double value = scan.nextDouble();
            if (value <= 0) throw new Exception("| valor precisa ser positivo!");

            System.out.print("| digite a quantidade de meses: ");
            int time = scan.nextInt();
            if (time <= 0) throw new Exception("| valor de meses invalido!");

            System.out.print("| entre com a taxa de juros mensal[em %]: ");
            double rate = (scan.nextDouble()/100.0);
            if (rate <= 0) throw new Exception("| taxa de juros precisa ser positiva!");

            var local = new Locale("pt", "BR");
            var fmt = NumberFormat.getCurrencyInstance(local);

            double ac = Financiamento.evalFormula(formula, value, time, rate);
            String res = fmt.format(ac);
            System.out.println("| " + outMsg + ": " + res);

            while (true)
            {
                System.out.print("\n| desejar fazer outra conta?[S/N]: ");
                char ans = Character.toUpperCase(scan.next().charAt(0));
                if ((ans != 'S') && (ans != 'N')) {
                    System.out.println("| opção inválida!");
                    this.waitKey();
                    continue;
                }

                if (ans == 'S') financingMenu(false, outMsg, formula);
                break;
            }
        }
        catch (Exception e)
        {
            this.errorMsg(e.getMessage());
            this.financingMenu(false, outMsg, formula);
        }
    }

    //-----------------------------------------------------
    private void logo()
    {
        this.clearScreen();
        System.out.println("*-------------------------------*");
        System.out.println("| Calculadora de Financiamentos |");
        System.out.println("*-------------------------------*");
    }

    //-----------------------------------------------------
    private void errorMsg(String text)
    {
        String msg = "| Entrada inválida!";

        if (text != "")
            msg = text;

        System.out.println(msg);
        this.waitKey();
    }

    //-----------------------------------------------------
    private static double evalFormula(Formula formula, double principal, int time, double rate)
    {
        return formula.eval(principal, time, rate);
    }

    //-----------------------------------------------------
    private static double annuity(double principal, int time, double rate)
    {
        double res = principal * (1.0 + rate);
        res *= Math.pow(1.0 + rate, time) - 1.0;
        return res/rate;
    }

    //-----------------------------------------------------
    private static double future(double principal, int time, double rate)
    {
        double res = principal * Math.pow(1.0 + rate, time);
        return res;
    }

    //-----------------------------------------------------
    private static double financing(double principal, int time, double rate)
    {
        double res = principal * rate * Math.pow(1.0 + rate, time);
        res /= Math.pow(1+rate, time) - 1.0;
        return res;
    }

    //-----------------------------------------------------
    private void waitKey()
    {
        new Scanner(System.in).nextLine();
    }

    //-----------------------------------------------------
    private void clearScreen()
    {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch(Exception e) {
            System.out.println("| aconteceu um erro e o progrma precisa ser abortado!");
            e.printStackTrace();
        }
    }
}


public interface Formula {
    double eval(double principal, int time, double rate);
}
