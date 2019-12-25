
import java.util.Scanner;

/**
 *
 * @author Inroger
 */
public class Huy {

    public static void main(String[] args) {
        Scanner Huy = new Scanner(System.in);
        int lottery;
        int reward = (int) (Math.random() * 1000000);
        int Money_lost = 0;
        int round = 0;

        System.out.println("=============================================");
        System.out.println("[For Dev only]Reward is " + reward);
        System.out.println("=============================================");
        
        System.out.println("Welcome to the lottery simulators. V.Alpha project.");
        System.out.println("We have all number for you (000000-999999). That is 1 million number for you.");
        System.out.print("Select your first Number of lottery :");
        lottery = Huy.nextInt();

        while (!(lottery == reward)) {
//            System.out.println("Sorry, It's your bad luck for this time.");
//            System.out.println("This reward number is " + reward);
//            System.out.println("You buy lottery " + round + " time.");
            reward = (int) (Math.random() * 1000000);
            round += 1;
            Money_lost += 100;
        }

        int month = round / 2;
        int year = month / 12;
        System.out.println("!! " + reward + "  You get the price. You Are winner. !!");
        System.out.println("!! You Use " + round + "round. and " + month + " month or years" + year + "to be win.");
        System.out.println("And that mean you agree to pay " + Money_lost + " Baht for 2,000,000 Baht");
    }
}
