package kodra_schooldudes;

/**
 * @author besian kodra
 */
public class MySchoolPerson 
{
    public String firstName,
                  lastName,
                  phoneNumber,
                  streetAddress;
    public int zipCode;
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + streetAddress + " "
                + zipCode + " " + phoneNumber;
    }
}
