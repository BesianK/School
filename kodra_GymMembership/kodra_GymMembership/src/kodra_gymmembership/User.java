package kodra_gymmembership;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Besian Kodra
 */
public class User 
{
    String name;
    int membID;
    double balance,
           customerPay,
           newBalance;
    char screenInput;
    
    Account acct1;
    
    public void getInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter E for new member enrollment or P to pay on an existing account: ");
        screenInput = input.next().toUpperCase().charAt(0);
        input.nextLine();
        System.out.println("Enter account holder's first name: ");
        name = input.nextLine();
        
        System.out.println("Enter account holder's ID number");
        membID = input.nextInt();
        
        System.out.println("Enter account holder's balance: ");
        balance = input.nextDouble();
        
        if (screenInput == 'P')
        {
        System.out.println("Enter deposit amount: ");
        customerPay = input.nextDouble();
        newBalance = balance - customerPay;
        acct1 = new Account(name, membID, balance, customerPay);
        }
        if (screenInput == 'E')
        {
        acct1 = new Account(name, membID, balance);
        }
    }
    
    public void displayUserInfo()
    {
        System.out.println("\nHere is your transaction information: ");
        
        DecimalFormat bal = new DecimalFormat("###.00");
        if (screenInput == 'P')
        {
        System.out.println("Name: " + acct1.getFirstName() + "\nMember I.D.: " + acct1.getMembID()
                + "\nAccount type: " + screenInput + "\nBalance: " + acct1.getBalance() + "\nAmount paid: " + customerPay
                + "\nBalance after deposit: " + bal.format(newBalance));
        }
        if (screenInput == 'E')
        {
        System.out.println("Name: " + acct1.getFirstName() + "\nMember I.D.: " + acct1.getMembID() 
                + "\nAccount type: " + screenInput + "\nBalance: " + acct1.getBalance());
        }
    }
}
