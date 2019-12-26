
import java.util.Scanner;

/**
 *
 * @author Inroger
 */
public class RPS {

    public static void main(String[] args) {
        int SP1Win = 0;
        int SP1Lose = 0;
        int SP1Draw = 0;
//        int SP2Win = 0;
//        int SP2Lose = 0;
//        int SP2Draw = 0;
        int SComWin = 0;
        int SComLose = 0;
        int SComDraw = 0;
        Scanner kb = new Scanner(System.in);
        Scanner mode = new Scanner(System.in);
        Rule();
        Mode(SP1Win, SP1Lose, SP1Draw, SComWin, SComLose, SComDraw);
    }

    private static void Rule() {
        System.out.println("== Rock-Paper-Scissors Game. ==");
        System.out.println("=Rule is simple select one of this ==");
        System.out.println("Pick (1) For -Rock- (Win Scissors),(Lose Paper)");
        System.out.println("Pick (2) For -Paper- (Win Rock),(Lose Scissors)");
        System.out.println("Pick (3) For -Scissors- (Win Paper),(Lose Rock)");
        System.out.println("But if you pick same of enemy it's will draw");
    }

    private static void Mode(int SP1Win, int SP1Lose, int SP1Draw, int SComWin, int SComLose, int SComDraw) {
        System.out.println("");
        System.out.println("Now you know the rule Select game mode.");
        System.out.println("Select (1) for Player1 V Player2.");
        System.out.println("Select (2) for Player V Computer.");
        System.out.println("Select (3) for show scoreboard.");
        System.out.println("Select (4) for show the rule again.");
        System.out.println("==== Select your mode ====");

        int menu;
        Scanner kb = new Scanner(System.in);
        do {
            menu = kb.nextInt();
            switch (menu) {
                case 1:
                    PVP();
                    break;
                case 2:
                    PVE(SP1Win, SP1Lose, SP1Draw, SComWin, SComLose, SComDraw);
                    break;
                case 3:
                    score(SP1Win, SP1Lose, SP1Draw, SComWin, SComLose, SComDraw);
                    break;
                case 4:
                    Rule();
                    break;
                case 5:
                    Quit();
                    break;
                case 6:
                    TestMethod(SP1Win, SP1Lose, SP1Draw, SComWin, SComLose, SComDraw);
                    break;
                default:
                    System.err.println("We have only 1-2-3-4 choice for you. Pick again.");
            }
            System.out.println("");
            System.out.println("Now you know the rule Select game mode.");
            System.out.println("Select (1) for Player1 V Player2.");
            System.out.println("Select (2) for Player V Computer.");
            System.out.println("Select (3) for show scoreboard.");
            System.out.println("Select (4) for show the rule again.");
            System.out.println("==== Select your mode ====");
        } while (menu != 5);
    }

    private static void PVP() {
        System.out.println("-Comming Soon-");
        Quit();
    }

    private static void PVE(int SP1Win, int SP1Lose, int SP1Draw, int SComWin, int SComLose, int SComDraw) {
        int Compick = (int)((Math.random() * 3) + 1);
        System.out.println("=============================================");
        System.out.println("[For Dev only]Reward is " + Compick);
        System.out.println("=============================================");
        Scanner player = new Scanner(System.in);
        int playerPick = player.nextInt();
        if (Compick == 1) {
            switch (playerPick) {
                case 1:
                    System.out.println("You pick a [Rock]");
                    System.out.println("Computer pick a [Rock]");
                    playerDraw(SP1Draw);
                    computerDraw(SComDraw);
                    System.out.println("Draw");
                    break;
                case 2:
                    System.out.println("You pick a [Paper]");
                    System.out.println("Computer pick a [Rock]");
                    playerWin(SP1Win);
                    computerLose(SComLose);
                    System.out.println("You Win!");
                    break;
                case 3:
                    System.out.println("You pick a [Scissors]");
                    System.out.println("Computer pick a [Rock]");
                    computerWin(SComWin);
                    playerLose(SP1Lose);
                    System.out.println("You Lose!");
                    break;
                default:
                    break;
            }
        }
        if (Compick == 2) {
            switch (playerPick) {
                case 1:
                    System.out.println("You pick a [Rock]");
                    System.out.println("Computer pick a [Paper]");
                    computerWin(SComWin);
                    playerLose(SP1Lose);
                    System.out.println("You Lose!");
                    break;
                case 2:
                    System.out.println("You pick a [Paper]");
                    System.out.println("Computer pick a [Paper]");
                    playerDraw(SP1Draw);
                    computerDraw(SComDraw);
                    System.out.println("Draw");
                    break;
                case 3:
                    System.out.println("You pick a [Scissors]");
                    System.out.println("Computer pick a [Paper]");
                    playerWin(SP1Win);
                    computerLose(SComLose);
                    System.out.println("You Win!");
                    break;
                default:
                    break;
            }
        }
        if (Compick == 3) {
            switch (playerPick) {
                case 1:
                    System.out.println("You pick a [Rock]");
                    System.out.println("Computer pick a [Scissors]");
                    playerWin(SP1Win);
                    computerLose(SComLose);
                    System.out.println("You Win!");
                    break;
                case 2:
                    System.out.println("You pick a [Paper]");
                    System.out.println("Computer pick a [Scissors]");
                    computerWin(SComWin);
                    playerLose(SP1Lose);
                    System.out.println("You Lose!");
                    break;
                case 3:
                    System.out.println("You pick a [Scissors]");
                    System.out.println("Computer pick a [Scissors]");
                    playerDraw(SP1Draw);
                    computerDraw(SComDraw);
                    System.out.println("Draw");
                    break;
                default:
                    break;
            }
        }
    }

    private static void score(int SP1Win, int SP1Lose, int SP1Draw, int SComWin, int SComLose, int SComDraw) {
        System.out.println("===Scoreboard===");
        System.out.println("Player 1 win " + SP1Win + " times.");
        System.out.println("Player 1 lose " + SP1Lose + " times.");
        System.out.println("Player 1 draw " + SP1Draw + " times.");
        System.out.println("Computer win " + SComWin + " times.");
        System.out.println("Computer lose " + SComLose + " times.");
        System.out.println("Computer draw " + SComDraw + " times.");
    }

    private static void TestMethod(int SP1Win, int SP1Lose, int SP1Draw, int SComWin, int SComLose, int SComDraw) {
        playerWin(SP1Win);
        playerLose(SP1Lose);
        playerDraw(SP1Draw);
        computerWin(SComWin);
        computerLose(SComLose);
        computerDraw(SComDraw);
    }

    private static int playerWin(int SP1Win) {
        return SP1Win++;
    }

    private static int playerLose(int SP1Lose) {
        return SP1Lose++;
    }

    private static int playerDraw(int SP1Draw) {
        return SP1Draw++;
    }

    private static int computerWin(int SComWin) {
        return SComWin++;
    }

    private static int computerLose(int SComLose) {
        return SComLose++;
    }

    private static int computerDraw(int SComDraw) {
        return SComDraw++;
    }

    public static void Quit() {
        System.err.println("Good bye !!");
        System.exit(0);
    }
}
