package kodra_schooldudes;

/**
 * @author besian kodra
 */
public abstract class Person 
{
    private String firstName,
            lastName,
            address,
            zip,
            phoneNum;

    public Person() 
    {
        firstName = "";
        lastName = "";
        address = "";
        zip = "";
        phoneNum = "";
    }
    public String getFirstName() 
    {
        return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public String getZip() 
    {
        return zip;
    }
    public void setZip(String zip) 
    {
        this.zip = zip;
    }
    public String getPhoneNum() 
    {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) 
    {
        this.phoneNum = phoneNum;
    }
    public void displayAll() 
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address + ", " + zip);
        System.out.println("Phone: " + phoneNum);
    }
}