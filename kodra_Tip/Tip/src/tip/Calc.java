package tip;
import java.util.Scanner;
/**
 * Besian Kodra
 * ITDEV 140-200
 */
public class Calc 
{
    String restName;
    double tip,
           tipAmount,
           mealTotal,
           subTotal,
           grandTotal,
           TAX_RATE = 0.056,
           partyNum,
           indivAmount,
           tipEntered = 51.00;
    
    Scanner in = new Scanner(System.in);
    
    public void inScreen()
    {
        System.out.println("████████████████████████████████████████████████████████████████████████");
        
        System.out.println("Please enter the name of the restaurant where you are dining and press the Enter key: ");
        restName = in.nextLine();
        
        System.out.println("████████████████████████████████████████████████████████████████████████");
        
        System.out.println("Please enter the total dollar amount on your check and press the Enter key: ");
        mealTotal = in.nextDouble();
        
        System.out.println("████████████████████████████████████████████████████████████████████████");
        
        subTotal = (TAX_RATE * mealTotal) + mealTotal;
        
        while (tipEntered > 50)
        {
        System.out.println("Please enter the tip percentage (in whole numbers between 1 and 50) that you would like to leave: ");
        tipEntered = in.nextInt();
        }
        System.out.println("████████████████████████████████████████████████████████████████████████");
        
        System.out.println("How many people are in your party? Please enter 1 if you're just paying yourself.");
        partyNum = in.nextDouble();
        
        System.out.println("████████████████████████████████████████████████████████████████████████");
                    
        tip = tipEntered / 100;
        tipAmount = (tip * subTotal);
    }
    public void tipCalc()
    {
        System.out.println("████████████████████████████████████████████████████████████████████████");
        System.out.println("The total on your check before tax was: " + mealTotal);
        System.out.printf("The total with tax is:%1.2f", subTotal);
        System.out.println("\nYour tip percentage is: " + tipEntered);
        System.out.printf("The tip total comes to:%1.2f", tipAmount);
        System.out.println("\nThe amount of people this bill is being divided by is: " + partyNum);
        System.out.println("████████████████████████████████████████████████████████████████████████");
    }
    public void totalBill()
    {
        System.out.println("████████████████████████████████████████████████████████████████████████");
        System.out.println("We hope you enjoyed dining at " + restName);
        System.out.println("████████████████████████████████████████████████████████████████████████");
        grandTotal = tipAmount + subTotal;
        
        indivAmount = (grandTotal / partyNum);
        
        System.out.printf("The grand total is:%1.2f", grandTotal);
        System.out.printf("\nEvery individual in the party owes:%1.2f", indivAmount);
        System.out.println("\nThank you for using out app!");
        System.out.println("████████████████████████████████████████████████████████████████████████");
    }
}