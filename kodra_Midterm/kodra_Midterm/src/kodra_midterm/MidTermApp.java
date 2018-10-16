package kodra_midterm;
/**
 * @author Besian Kodra
 */
public class MidTermApp 
{
    public static void main(String[] args) 
    {
        Introduction admin = new Introduction();
        Controller run = new Controller();
        
        admin.Intro();
        run.RunApp();
        admin.Outro();
    }
}