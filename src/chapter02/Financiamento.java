/*
 Clone da calculadora de juros pra Android.
 Author: Philippe
*/

import java.util.Scanner;


public class Financiamento 
{
    //-----------------------------------------------------
    Scanner m_scan = new Scanner(System.in);

    //-----------------------------------------------------
    public static void main(String[] args)
    {
        var fn = new Financiamento();
        fn.mainMenu();
    }


    //-----------------------------------------------------
    public void mainMenu()
    {
        boolean run = true;

        while (run)
        {
            try {
                this.logo();

                System.out.println("| escolha uma opção:\n");
                System.out.println("1. Aplicação");
                System.out.println("2. Financiamento");
                System.out.println("3. Valor Futuro");
                System.out.println("4. Correção de Valores");
                System.out.println("5. Sair");

                System.out.print(">> ")
                int opt = m_scan.nextInt();
                switch(opt)
                {
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: run = false; break;
                    default: throw new Exception("");
                }
            } catch (Exception e) {
                this.errorMsg();
            }
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
    private void errorMsg()
    {
        System.out.println("| Entrada inválida!");
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
        var k = m_scan.nextLine();
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
