package kodra_midterm;
/**
 * @author Besian Kodra
 */
public class Account 
{
    public String customerName;
    public String accountType;
    public String dateCreated;
    public double interestRate;
    public double accountBalance;
    public double interestEarned;

    public Account(String name, String type, double rate, String date, double balance)
    {
        customerName = name;
        accountType = type;
        interestRate = rate;
        dateCreated = date;
        accountBalance = balance;
    }
    public String getCustomerName() 
    {
        return customerName;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }
    public String getAccountType() 
    {
        return accountType;
    }
    public void setAccountType(String accountType) 
    {
        this.accountType = accountType;
    }
    public double getInterestRate() 
    {
        return interestRate;
    }
    public void setInterestRate(double interestRate) 
    {
        this.interestRate = interestRate;
    }
    public String getDateCreated() 
    {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) 
    {
        this.dateCreated = dateCreated;
    }
    public double getAccountBalance() 
    {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) 
    {
        this.accountBalance = accountBalance;
    }
    public double calculateInterest()
    {
        double interest = interestEarned = interestRate * accountBalance;
        return interest;
    }
    public String getUniqueMessage()
    {
      String type = "This is a generic bank account.";
      return type;
    }
}
