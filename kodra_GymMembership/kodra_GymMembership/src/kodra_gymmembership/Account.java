package kodra_gymmembership;
/**
 *
 * @author Besian Kodra
 */
public class Account 
{
    public String firstName;
    public int membID;
    public double balance,
                  amount,
                  newBalance;

    public Account(String initFName, int initMembID, double initBalance)
    {
        firstName  = initFName;
        membID = initMembID;
        balance = initBalance;
    }
    
    public Account(String initFName, int initMembID, double initBalance, double CustomerPay)
    {
       firstName  = initFName; 
       membID = initMembID;
       balance = initBalance;
       amount = CustomerPay;
    }
    
    public String getFirstName() 
    {
        return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public int getMembID()
    {
        return membID;
    }
    public void setMembID(int membID)
    {
        this.membID = membID;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getAmount()
    {
        return amount;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public double getNewBalance()
    {
        return newBalance;
    }
    public void setNewBalance(double newBalance) 
    {
        this.newBalance = newBalance;
    }
}
