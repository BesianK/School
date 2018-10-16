package kodra_ofakind;

/**
 * @author besian kodra
 */
import java.util.Scanner;
public class Kodra_OfAKind 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        dieRoll playerOne = new dieRoll();
        dieRoll playerTwo = new dieRoll();
        String again;
        System.out.println("Welcome to the \"Of A Kind\" app, a game. You and I will roll 5 dice\nand whoever has the highest value wins the round.");
        System.out.println("There will be 10 rounds. Whoever wins the most rounds, wins.\n");
        System.out.println("Hierarchy of die value:\nFive of a kind\nFour of a kind\nThree of a kind\nTwo pairs\nA pair\n");

        do 
        {
            int oneScore = 0, twoScore = 0, tie = 0, rounds = 0;
            do 
            {
                playerOne.ones = 0;
                playerOne.twos = 0;
                playerOne.threes = 0;
                playerOne.fours = 0;
                playerOne.fives = 0;
                playerOne.sixes = 0;
                playerTwo.ones = 0;
                playerTwo.twos = 0;
                playerTwo.threes = 0;
                playerTwo.fours = 0;
                playerTwo.fives = 0;
                playerTwo.sixes = 0;           
                System.out.println("Round: " + (rounds + 1));
                System.out.println("------------------------------");
                System.out.println("You rolled");
                playerOne.roll();
                playerOne.highestDieVal();

                System.out.println("\nPress ENTER to continue...");
                scan.nextLine();

                System.out.println("My turn.\n");
                playerTwo.roll();
                playerTwo.highestDieVal();

                if (playerOne.winLose == playerTwo.winLose) 
                {
                    if (playerOne.highestFace == playerTwo.highestFace) 
                    {
                        tie += 1;
                        System.out.println("\n**It's a tie.**");
                    } else if (playerOne.highestFace > playerTwo.highestFace) 
                    {
                        oneScore += 1;
                        System.out.println("\n**You win.**");
                    } else 
                    {
                        twoScore += 1;
                        System.out.println("\n**I win**");
                    }
                } 
                else if (playerOne.winLose > playerTwo.winLose) 
                {
                    oneScore += 1;
                    System.out.println("\n**You win.**");
                } else {
                    twoScore += 1;
                    System.out.println("\n**I win.**");
                }

                System.out.println("Press ENTER to continue..");
                scan.nextLine();

                rounds++;
            } 
            while (rounds != 10);

            System.out.println("Final score is...\nYour Score: " + oneScore + "\nMy Score: " + twoScore + "\nTies: " + tie);
            if (oneScore == twoScore) 
            {
                System.out.println("It's a tie!"); 
            } 
            else if (oneScore > twoScore) 
            {
                System.out.println("You beat me! :(");
            } 
            else 
            {
                System.out.println("I beat you! :)");
            }
            System.out.println("Do you want to play again? Y or N");
            again = scan.nextLine().toUpperCase();
        }
        while ("Y".equals(again));
    }

}