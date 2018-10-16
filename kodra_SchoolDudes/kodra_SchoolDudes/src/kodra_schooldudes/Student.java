package kodra_schooldudes;

/**
 * @author besian kodra
 */
public class Student extends Person 
{
    private String major;
    private double gpa;

    public Student() 
    {
        major = "";
        gpa = 0;
    }
    public String getMajor()
    {
        return major;
    }
    public void setMajor(String major)
    {
        this.major = major;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    @Override
    public void displayAll()
    {
        super.displayAll();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}