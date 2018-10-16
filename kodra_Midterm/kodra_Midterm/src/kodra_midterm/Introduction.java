package kodra_midterm;
import java.util.Scanner;
/**
 * @author Besian Kodra
 */
public class Introduction 
{
    Scanner in = new Scanner(System.in);
    
    public void Intro()
    {
        System.out.println("\tWelcome to Besian Kodra's Banking App!"
                + "\n\tMade exclusively for Mr. Jones' ITDEV 140 class."
                + "\n\tFollowing this introduction you will see a list of "
                + "\n\tbank accounts and their attributes."
                + "\n\tPress Enter to continue.\n\n");
        in.nextLine();
    }
    public void Outro()
    {
        System.out.println("\n\n\tI hope you enjoyed my banking app!"
                + "\n\tPress Enter to close the app.");
        in.nextLine();
        System.out.println("\n\tGoodbye!");
    }
}