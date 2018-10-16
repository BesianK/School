package kodra_guesstheword;
/**
 * @author Besian Kodra
 */
public class MatchData 
{
    private String guess;
    private int index; 
    private int numMatches;
    
    public String getGuess()
    {
      return guess;
    }   
    public void setGuess(String g)
    {
       guess = g;
    }   
    public int getIndex()
    {
      return index;
    }            
    public void setIndex(int idx)
    {
       index = idx;
    }        
    public int getnumMatches()
    {
      return numMatches;
    }    
    public void incrementNumMatches()
    {
       numMatches++;
    }    
}