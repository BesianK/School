package kodra_guesstheword;
/**
 * @author Besian Kodra
 */
public class Controller 
{
    public static void main(String[] args) 
    {
        RunApp start = new RunApp();
        Introduction display = new Introduction();
        
        start.Run();
        display.goodBye();
    }
}