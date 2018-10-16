package kodra_schooldudes;

import java.util.Scanner;

/**
 * @author besian kodra
 */
public class Faculty extends CollegeEmployee 
{
    boolean tenured;
    Scanner in = new Scanner(System.in);

    public boolean checkTenured() 
    {
        System.out.print("\nIs the faculty member tenured? Y or N: ");
        String response = in.next().toUpperCase();
        if (response.equals("Y")) 
        {
            return tenured = true;
        } else 
        {
            return tenured = false;
        }
    }
    @Override
    public void displayAll() 
    {
        super.displayAll();
        if (tenured == true) 
        {
            System.out.println("Faculty member is tenured.");
        } else 
        {
            System.out.println("Faculty member is not tenured.");
        }
    }
}