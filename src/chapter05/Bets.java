/**
* jogo de postas com cara ou coroa
* Autor: Philippe Matias
*/

import java.util.Scanner;
import java.security.SecureRandom;


/*------------------------------------------*/
public class Bets
{
    /*------------------------------------------*/
    private static final int EASY = 1;
    private static final int MEDIUM = 2;
    private static final int HARD = 3;
    private String m_playerName;
    private int m_level;
    private int m_cash;

    /*------------------------------------------*/
    public static void main(String[] args)
    {
        new Bets().start();
    }

    /*------------------------------------------*/
    private void bet()
    {
        var in  = new Scanner(System.in);
        var rnd = new SecureRandom();

        int tries = this.initialTries(m_level);
        m_cash = this.initialCash(m_level);
        int playerChoice = 0;
        int cpuCash = m_cash * 2;
        int cpuChoice = 0; //apenas para inicializar

        for (int i = 0; i < tries; ++i)
        {
            System.out.printf("\n** enter the amount to bet[your cash: $%d]: ", m_cash);
            var myBet = new Scanner(System.in).nextInt(); // escolha do jogador

            int start = rnd.nextInt(2); //0, vc começa, 1 cpu começa
            if (start == 0) {
                System.out.println("\n** you start.");
                System.out.print("** head or toss[0 | 1]: ");
                playerChoice = in.nextInt();
                cpuChoice = ~playerChoice & 0x1; //cpu é oposto do jogador
            } else {
                System.out.println("\n** cpu starts.");
                cpuChoice = rnd.nextInt(2);
                playerChoice = ~cpuChoice & 0x1;
            }

            int coin = rnd.nextInt(2);

            System.out.printf("| you: %s\n", this.coinStr(playerChoice));
            System.out.printf("| cpu: %s\n", this.coinStr(cpuChoice));
            System.out.printf("| coin: %s\n", this.coinStr(coin));

            if (playerChoice == coin) {
                System.out.println("** you won the match! :)");
                m_cash += myBet;
                cpuCash -= myBet;
            } else {
                System.out.println("** you lost the match! :(");
                m_cash -= myBet;
                cpuCash += myBet;
            }

            System.out.printf("** your cash: %d\n", m_cash);

            if (m_cash <= 0) {
                System.out.print("** you lost all the cash. :(\n\n");
                System.out.print("** you lost the game. :(\n\n");
                return;
            }
        }

        System.out.println("\n****************************************");
        if (m_cash > this.initialCash(m_level))
            System.out.println("** you won the game. :D\n");
        else
            System.out.println("** you lost the game. :(\n");
    }

    /*------------------------------------------*/
    private String coinStr(int i)
    {
        switch (i)
        {
          case 0:  return "head";
          case 1:  return "toss";
          default: return "";
        }
    }

    /*------------------------------------------*/
    private int initialCash(int level)  { return (int)Math.pow(10, 6 - m_level); }
    private int initialTries(int level) { return (-5*m_level + 20); }

    /*------------------------------------------*/
    private void start()
    {
        var in = new Scanner(System.in);

        System.out.print("** enter your name: ");
        m_playerName = in.nextLine();

        System.out.print("** what level [1-E | 2-M | 3-H]: ");
        m_level = in.nextInt();

        this.bet();
    }
}
