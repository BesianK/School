package kodra_schooldudes;

/**
 * @author besian kodra
 */
public class CollegeEmployee extends Person 
{
    private String ssn, 
            department;
    private double salary;

    public CollegeEmployee() 
    {
        ssn = "";
        department = "";
        salary = 0;
    }
    public String getSsn() 
    {
        return ssn;
    }
    public void setSsn(String ssn) 
    {
        this.ssn = ssn;
    }
    public String getDepartment() 
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    @Override
    public void displayAll() 
    {
        super.displayAll();
        System.out.println("SSN: " + ssn);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + java.text.NumberFormat.getCurrencyInstance().format(salary));
    }
}