package kodra_midterm;
/**
 * @author Besian Kodra
 */
public class Checking extends Account
{
    public boolean hasOverdraftProtection = true;
    
    public Checking (String name, String type, double rate, String date, double balance, double interestRate)
    {
        super(name, type, rate, date, balance);
        this.interestRate = 0.2;
    }
    public boolean getHasOverdraftProtection() 
    {
        return hasOverdraftProtection;
    }
    public void setHasOverdraftProtection(boolean hasOverdraftProtection) 
    {
        this.hasOverdraftProtection = hasOverdraftProtection;
    }
    public String hasOverdraftProtection() 
    {
        if (getHasOverdraftProtection() != true)
        {
            return "No";
        }
        else
        {
            return "Yes";
        }
    }
    @Override
    public double calculateInterest()
    {
        double interest = interestEarned = interestRate * accountBalance;
        return interest;
    }
    @Override
    public String getUniqueMessage()
    {
        String type = "This is a Checking Account";
        return type;
    }
}
