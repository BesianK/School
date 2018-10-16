package kodra_guesstheword;
import static kodra_guesstheword.RunApp.guessCount;
import java.awt.Toolkit;
import java.util.Scanner;
import java.util.*;
/**
 * @author Besian Kodra
 */
public class Player 
{
    public int numMatches = 0;
    public char letterInPlay;           
    Controller cn = new Controller();
    
    public char playGame() 
    {
        System.out.print("\n\t Guess a letter...");
        System.out.print("\n\n");

        Scanner input = new Scanner(System.in);
        char screenInput = input.next().charAt(0);
        return screenInput;
    }
    public char receivePlayerInput() 
    {    
            Scanner input = new Scanner(System.in);
            char screenInput = input.next().toUpperCase().charAt(0);
            
            if (screenInput == '1')    
            {
                System.out.println("Get ready, preparing the word...");
                try {
                      Thread.sleep(1500);
                      SoundPlay();
                    } catch (Exception e) 
                    {
                      //do something
                    };               
            }
            else if (screenInput == '2') 
            {
                try 
                    {
                      System.out.println("Exiting Game...");
                      Thread.sleep(4000);
                      System.out.println("Goodbye...");
                    } catch (Exception e) 
                    {
                      //do something
                    }
                    System.exit(0);             
            } 
            else  
            {
               letterInPlay = screenInput; 
            }              
            return letterInPlay;                 
    } 
    ArrayList<MatchData> matches = new ArrayList<MatchData>();
    public ArrayList<MatchData> checkWordForMatch(ArrayList<String> a, ArrayList<String> b, char c)
    {
            ArrayList<String> Words = a;
            ArrayList<String> Clones = b;
            String next;
            String guess = "*";
            MatchData d;
            int index = 0;
            
            matches.clear();
            for (Iterator<String> iterator = Words.iterator(); iterator.hasNext();)      
            {                 
                 next = iterator.next();
                if (next.equals(String.valueOf(c)))     
                {
                     System.out.println("Good guess!");
                     SoundPlay();
                     guess = next;
                     d = new MatchData();
                     d.setGuess(guess);
                     d.setIndex(index);
                     matches.add(d);
                     numMatches++;
                     System.out.println(numMatches);
                } 
                else 
                {                        
                     guess = "*";
                }
                index++;
            }           
             if (numMatches > 1)
             {
                 System.out.println("There are multiple matches " + matches.size());
             }
            return matches;                                  
    }    
 public MatchData checkWordForMisMatch(ArrayList<String> a, char c)
    {        
            ArrayList<String> Words = a;
            
            String next;
            String guess = "*";
            MatchData d = null;
            int index = 0;
            
            matches.clear();
            for (Iterator<String> iterator = Words.iterator(); iterator.hasNext();)      
            {
                 
                 next = iterator.next();

                if (next.equals(String.valueOf(c)))     
                {
                     SoundPlay();
                     guess = next;
                     d = new MatchData();
                     d.setGuess(guess);
                     d.setIndex(index);
                     matches.add(d);                                                    
                } 
                else 
                {                      
                     guess = "*";
                }
                index++;
            }            
             if (matches.size() == 0)
             {
                 System.out.println("\nThe letter " + c + " is not in this word.");
                 guessCount++;
                 d = new MatchData();
                 d.setIndex(-1);                  
                 d.setGuess(String.valueOf(c));   
             }
             else
             {
                 d = new MatchData();
                 d.setIndex(0);                                               
                 d.setGuess(String.valueOf(c)); 
             }
            return d;
    }
     public void SoundPlay()
              {  
                 Toolkit.getDefaultToolkit().beep();           
              }
}