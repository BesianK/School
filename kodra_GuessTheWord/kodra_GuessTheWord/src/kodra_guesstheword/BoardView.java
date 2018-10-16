package kodra_guesstheword;
import java.util.ArrayList;
/**
 * @author Besian Kodra
 */
public class BoardView 
{
    ArrayList<String> boardArray = new ArrayList<String>(); 
  
    public void setupGameBoard(int totalLetters) 
    {
           for (int i = 0; i < totalLetters; i++) 
           {
             boardArray.add("_ ");           
           }                 
           System.out.print("There are " + totalLetters + " letters in this word\n");              
           for (int i=0; i < totalLetters; i++) 
           {
           System.out.print(boardArray.get(i));    
           }        
     }
        public void updateBoard(ArrayList<MatchData> matchData) 
        {
             for (int i=0; i < matchData.size(); i++)
             {   
                boardArray.set(matchData.get(i).getIndex(), matchData.get(i).getGuess());
             }   
                   for (int i=0; i < boardArray.size(); i++) 
                   {
                      System.out.print(boardArray.get(i) + " ");
                   }            
        }   
        public void promptStart() 
        {           
            System.out.println("\tWelcome to Word Guess " + "\n\tPRESS (1) TO START"
              + "\n\tPRESS (2) TO QUIT");         
        }       
        public void displayWrongGuesses(ArrayList<MatchData> wg) 
        {
            for (int i=0; i < wg.size(); i++) 
            {
                System.out.print(wg.get(i).getGuess() + " ");
            }
        }
}