package tip;
import java.util.Scanner;
/**
 * Besian Kodra
 * ITDEV 140-200
 */
public class Admin 
{
    Scanner in = new Scanner(System.in);
    
    public void intro()
    {
        System.out.println("████████████████████████████████████████████████████████████████████████\n"
                + "\tWelcome to Besian's Tip Calculator!\n"
                + "\tPlease answer the following questions in order to calculate your tip and figure out your bill total.\n"
                + "\tWhen you are done, you will be given the option to start over or end the program.\n"
                + "\tYou may press the Enter key any time to begin.\n"
                + "████████████████████████████████████████████████████████████████████████");
        in.nextLine();
    }
    public void goodBye()
    {
        System.out.println("████████████████████████████████████████████████████████████████████████");
        System.out.println("Thank you for using this calculator app!\n"
                + "Please press the Enter key to exit.");
        in.nextLine();
        System.out.println("████████████████████████████████████████████████████████████████████████");
    }
}