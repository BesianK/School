package kodra_guesstheword;
import java.util.*;
import java.util.Scanner;
/**
 * @author Besian Kodra
 */
public class Introduction 
{
  public void displayInstructions()
  {
      System.out.println("\tWelcome to Besian's Guess The Word Game!" + 
              "\n\tThe computer is going to think of a random secret word and " +
              "\n\tyou have to figure out what word it is by guessing individual letters." +
              "\n\tHAVE FUN!");
  }
  public void goodBye()
  {
      System.out.println("Thank you for playing! I hope you enjoyed the game!");
  }
}