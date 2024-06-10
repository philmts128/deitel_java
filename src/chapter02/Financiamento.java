/*
 Clone da calculadora de juros pra Android.
 Author: Philippe
*/

import java.util.Scanner;


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
                case 1: this.annuityMenu(true); break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: m_running = false; break;
                default: throw new Exception("");
            }
        } catch (Exception e) {
            this.errorMsg("");
        }
    }

    //-----------------------------------------------------
    private void annuityMenu(boolean shwLogo)
    {
        if (shwLogo) this.logo();

        try
        {
            System.out.println("\n*-------------------------------------------*");

            System.out.print("| digite o valor a ser depositado: ");
            double value = m_scan.nextDouble();
            if (value <= 0) throw new Exception("| valor precisa ser positivo!");

            System.out.print("| digite a quantidde de meses: ");
            int time = m_scan.nextInt();
            if (time <= 0) throw new Exception("| valor de meses invalido!");

            System.out.print("| entre com a taxa de juros mensal[em %]: ");
            double rate = (m_scan.nextDouble()/100.0);
            if (rate <= 0) throw new Exception("| taxa de juros precisa ser positiva!");

            double ac = Financiamento.annuity(value, time, rate);
            System.out.printf("| valor acumulado + juros: %.2f\n", ac);

            while (true)
            {
                System.out.print("\n| desejar fazer outra conta?[S/N]: ");
                char ans = m_scan.next().charAt(0);
                ans = Character.toUpperCase(ans);
                if ((ans != 'S') && (ans != 'N')) {
                    System.out.println("| opçãoin válida!");
                    this.waitKey();
                    continue;
                }

                if (ans == 'S') annuityMenu(false);
                break;
            }
        }
        catch (Exception e)
        {
            this.errorMsg(e.getMessage());
            this.annuityMenu(false);
        }
    }

    //-----------------------------------------------------
    private void logo()
    {
        this.clearScreen();
        System.out.println("*-------------------------------*");
        System.out.println("| calculadora de financiamentos |");
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
    private static double annuity(double principal, int time, double rate)
    {
        double res = principal * (1.0 + rate);
        res *= Math.pow(1.0 + rate, time) - 1.0;
        return res/rate;
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
