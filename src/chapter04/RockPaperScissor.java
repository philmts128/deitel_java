
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissor
{
    /*---------------------------------------------*/
    private static final int ROCK    = 1;
    private static final int PAPER   = 2;
    private static final int SCISSOR = 3;
    private static final int EXIT    = 4;
    private static final int PLAYER  = 0xA;
    private static final int CPU     = 0xB;
    private static final int DRAW    = 0xC;
    private int m_cpuChoice;

    /*---------------------------------------------*/
    public static void main(String[] args)
    {
        new RockPaperScissor().start();
    }

    /*---------------------------------------------*/
    private void start()
    {
        while (true)
        {
            var sc = new Scanner(System.in);

            System.out.println("**************************************************");
            System.out.println("** choose an option:");
            System.out.printf("| %d - rock\n",    ROCK);
            System.out.printf("| %d - paper\n",   PAPER);
            System.out.printf("| %d - scissor\n", SCISSOR);
            System.out.printf("| %d - exit\n",    EXIT);

            System.out.print("\n>> ");
            int opt = sc.nextInt();

            switch (opt)
            {
              case ROCK:    match(opt); break;
              case PAPER:   match(opt); break;
              case SCISSOR: match(opt); break;
              case EXIT: System.exit(0);
              default:
                System.out.println("** invalid option!");
            }

            int res = this.match(opt);
            if (res == PLAYER) {
                System.out.println("\n** You won! :)");
            } else if (res == CPU) {
                System.out.println("\n** You lost! :(");
            } else {
                System.out.println("** Draw :|");
            }

            System.out.printf("| you: %s\n",   this.handName(opt));
            System.out.printf("| cpu: %s\n\n", this.handName(m_cpuChoice));
        }
    }

    /*---------------------------------------------*/
    private int match(int p) //player
    {
        int c = new Random().nextInt(3) + 1; //cpu try
        m_cpuChoice = c;

        //cpu wins
        boolean cw = (c == ROCK    && p == SCISSOR);
        cw        |= (c == SCISSOR && p == PAPER);
        cw        |= (c == PAPER   && p == ROCK);

        //player wins
        boolean pw = (p == ROCK    && c == SCISSOR);
        cw        |= (p == SCISSOR && c == PAPER);
        cw        |= (p == PAPER   && c == ROCK);

        if      (cw) return CPU;
        else if (pw) return PLAYER;
        else         return DRAW;
    }

    /*---------------------------------------------*/
    private String handName(int h)
    {
        if      (h == ROCK)    return "rock";
        else if (h == PAPER)   return "paper";
        else if (h == SCISSOR) return "scissor";
        else                   return "";
    }
}
