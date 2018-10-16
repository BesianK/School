package kodra_midterm;
/**
 * @author Besian Kodra
 */
public class MoneyMarket extends Account
{
    public boolean hasMinimumBalance = false;
    
    public MoneyMarket (String name, String type, double rate, String date, double balance, double interestRate)
    {
        super(name, type, rate, date, balance);
        this.interestRate = 0.5;
    }
    public boolean getHasMinimumBalance() 
    {
        return hasMinimumBalance;
    }
    public void setHasMinimumBalance(boolean hasMinimumBalance) 
    {
        this.hasMinimumBalance = hasMinimumBalance;
    }
    public String hasMinimumBalance()
    {
        if (getHasMinimumBalance() != false)
        {
            return "Yes";
        }
        else
        {
            return "No";
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
        String type = "This is a Money Market Account";
        return type;
    }
}