package kodra_schooldudes;

import java.util.Scanner;

/**
 * @author besian kodra
 */
public class Information 
{
    public void Intro()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to Besian Kodra's School Dudes App!"
                + "\nMade exclusively for Mr Jones' ITDEV 140 class."
                + "\nYou can use this app to enter, search, and display "
                + "\nschool employees, students, and faculty."
                + "\nPress the Enter key to continue.");
        in.nextLine();
    }
    public void Outro()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n\nI hope you enjoyed using this app!"
                + "\nPress Enter to exit.");
        in.nextLine();
        System.out.println("\n\nGoodbye!");
    }
}