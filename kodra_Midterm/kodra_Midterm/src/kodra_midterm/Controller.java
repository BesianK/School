package kodra_midterm;
import java.util.Scanner;
/**
 * @author Besian Kodra
 */
public class Controller 
{
    static Account account;
    static Checking checking;
    static MoneyMarket moneyMarket;
    
    public static void createAccounts()
    {
        account = new Account("Generic Customer", "Bank Account", 0.3, "03/12/2018", 250.00);
        moneyMarket = new MoneyMarket("Todd Grohall", "Money Market", 0.5, "02/26/2015", 12.53, 0.5);
        checking = new Checking("John Stanelle", "Checking Account", 0.2, "05/16/1982", 1254652.53, 0.2);
        
        MoneyMarket MM = moneyMarket;
        showAccount(MM);
        
        Checking C = checking;
        showAccount(C);
    }
    public static void testAccount()
    {
        if(account != null)
        {
            System.out.println("\n\tCustomer Name: " + account.getCustomerName());
            System.out.println("\tAccount Type: " + account.getAccountType());
            System.out.println("\tDate Opened: " + account.getDateCreated());
            System.out.println("\tInterest Rate: " + account.getInterestRate());
            System.out.println("\tAccount Balance: " + account.getAccountBalance());
            System.out.println("\tUnique Message: " + account.getUniqueMessage());
            System.out.println("\tInterest Earned: " + String.format("%.2f", account.calculateInterest()));
        }
    }
    public static void showAccount(MoneyMarket MM)
    {
        System.out.println("\n\tCustomer Name: " + MM.getCustomerName());
        System.out.println("\tAccount Type: " + MM.getAccountType());
        System.out.println("\tDate Opened: " + MM.getDateCreated());
        System.out.println("\tInterest Rate: " + MM.getInterestRate());
        System.out.println("\tAccount Balance: " + MM.getAccountBalance());
        System.out.println("\tRequires Minimum Balance: " + MM.hasMinimumBalance());
        System.out.println("\tUnique Message: " + MM.getUniqueMessage());
        System.out.println("\tInterest Earned: " + String.format("%.2f", MM.calculateInterest()));
    }
    public static void showAccount(Checking C)
    {
        System.out.println("\n\tCustomer Name: " + C.getCustomerName());
        System.out.println("\tAccount Type: " + C.getAccountType());
        System.out.println("\tDate Opened: " + C.getDateCreated());
        System.out.println("\tInterest Rate: " + C.getInterestRate());
        System.out.println("\tAccount Balance: " + C.getAccountBalance());
        System.out.println("\tHas Overdraft Protection: " + C.hasOverdraftProtection());
        System.out.println("\tUnique Message: " + C.getUniqueMessage());
        System.out.println("\tInterest Earned: " + String.format("%.2f", C.calculateInterest()));
    }
    public void RunApp()
    {
        Scanner in = new Scanner(System.in);
        
        createAccounts();
        testAccount();
        System.out.println("\n\tPress the Enter key to continue.");
        in.nextLine();
    }
}
