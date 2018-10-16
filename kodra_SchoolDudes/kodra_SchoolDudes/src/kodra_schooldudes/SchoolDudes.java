package kodra_schooldudes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author besian kodra
 */
public class SchoolDudes extends Person
{
    Scanner in = new Scanner(System.in);
    Information info = new Information();
    CollegeEmployee[] cEmployee = new CollegeEmployee[5];
    Faculty[] faculty = new Faculty[5];
    Student[] student = new Student[5];
    int[] numberOfDudes = new int[4];

    public boolean dude() 
    {
        boolean isValid;
        int selection;
        info.Intro();
        do 
        {
            isValid = true;
            System.out.println("\nWhat would you like to do? ");
            System.out.println("1. Add Someone\n2. Find Someone\n3. Display Category\n4. Quit");
            selection = Integer.valueOf(in.nextLine());
            switch (selection) 
            {
                case 1:
                    addDude();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    return false;
                default:
                    System.out.println("That is not a possible selection. Please try again.");
                    isValid = false;
                    break;
            }
        } while (isValid);
        return false;
    }
    public void addDude() 
    {
        boolean isValid;
        int selection;
        do 
        {
            String addMore;
            isValid = true;
            System.out.println("\nPlease select a category to add: ");
            System.out.println("1. College Employee\n2. Faculty\n3. Student\n4. Quit");
            selection = Integer.valueOf(in.nextLine());
            switch (selection) 
            {
                case 1:
                    for (int j = 0; j < cEmployee.length; j++) 
                    {
                        numberOfDudes[0] = j + 1;
                        cEmployee[j] = new CollegeEmployee();
                        System.out.println("\nPlease fill in the following information: ");
                        System.out.print("Employee's first name " + (j + 1) + ": ");
                        cEmployee[j].setFirstName(in.nextLine().toUpperCase());
                        System.out.print("Employee's last name " + (j + 1) + ": ");
                        cEmployee[j].setLastName(in.nextLine().toUpperCase());
                        System.out.print("Employee's Address " + (j + 1) + ": ");
                        cEmployee[j].setAddress(in.nextLine().toUpperCase());
                        System.out.print("Employee's zip code " + (j + 1) + ": ");
                        cEmployee[j].setZip(in.nextLine().toUpperCase());
                        System.out.print("Employee's phone number " + (j + 1) + ": ");
                        cEmployee[j].setPhoneNum(in.nextLine().toUpperCase());
                        System.out.print("Employee's SSN " + (j + 1) + ": ");
                        cEmployee[j].setSsn(in.nextLine().toUpperCase());
                        System.out.print("Employee's department " + (j + 1) + ": ");
                        cEmployee[j].setDepartment(in.nextLine().toUpperCase());
                        System.out.print("Employee's salary " + (j + 1) + ": ");
                        cEmployee[j].setSalary(Double.parseDouble(in.nextLine()));
                        System.out.print("\nWould you like to add another employee? Y or N: ");
                        addMore = in.nextLine().toUpperCase();
                        if (!addMore.equals("Y")) 
                        {
                            break;
                        }
                        if (numberOfDudes[0] == 5) 
                        {
                            System.out.println("\nYou have reached the maximum number of employees that can be added.");
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < faculty.length; j++) 
                    {
                        faculty[j] = new Faculty();
                        numberOfDudes[1] = j + 1;
                        System.out.println("\nPlease fill in the following information: ");
                        System.out.print("Faculty member's first name " + (j + 1) + ": ");
                        faculty[j].setFirstName(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's last name " + (j + 1) + ": ");
                        faculty[j].setLastName(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's Address " + (j + 1) + ": ");
                        faculty[j].setAddress(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's zip code " + (j + 1) + ": ");
                        faculty[j].setZip(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's phone number " + (j + 1) + ": ");
                        faculty[j].setPhoneNum(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's SSN " + (j + 1) + ": ");
                        faculty[j].setSsn(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's department " + (j + 1) + ": ");
                        faculty[j].setDepartment(in.nextLine().toUpperCase());
                        System.out.print("Faculty member's salary " + (j + 1) + ": ");
                        faculty[j].setSalary(Double.parseDouble(in.nextLine()));
                        faculty[j].checkTenured();
                        System.out.println("\nWould you like to add another faculty member? Y or N: ");
                        addMore = in.nextLine().toUpperCase();
                        if (!addMore.equals("Y")) 
                        {
                            break;
                        }
                        if (numberOfDudes[1] == 5) 
                        {
                            System.out.println("\nYou have reached the maximum number of faculty members that can be added.");
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < student.length; j++) 
                    {
                        student[j] = new Student();
                        numberOfDudes[2] = j + 1;
                        System.out.println("\nPlease fill in the following information: ");
                        System.out.print("Student's first name " + (j + 1) + ": ");
                        student[j].setFirstName(in.nextLine().toUpperCase());
                        System.out.print("Student's last name " + (j + 1) + ": ");
                        student[j].setLastName(in.nextLine().toUpperCase());
                        System.out.print("Student's address " + (j + 1) + ": ");
                        student[j].setAddress(in.nextLine().toUpperCase());
                        System.out.print("Student's zip code " + (j + 1) + ": ");
                        student[j].setZip(in.nextLine().toUpperCase());
                        System.out.print("Student's phone number " + (j + 1) + ": ");
                        student[j].setPhoneNum(in.nextLine().toUpperCase());
                        System.out.print("Student's major " + (j + 1) + ": ");
                        student[j].setMajor(in.nextLine().toUpperCase());
                        System.out.print("Student's GPA " + (j + 1) + ": ");
                        student[j].setGpa(Double.parseDouble(in.nextLine()));
                        System.out.println("\nWould you like to add another student? Y or N: ");
                        addMore = in.nextLine().toUpperCase();
                        if (!addMore.equals("Y")) 
                        {
                            break;
                        }
                        if (numberOfDudes[2] == 5) 
                        {
                            System.out.println("\nYou have reached the maximum number of students that can be added.");
                            break;
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nThat is not a possible selection. Please try again.");
                    isValid = false;
                    break;
            }
        } while (!isValid);
    }
    public void find() 
    {
        ArrayList cEmpLastNames = new ArrayList();
        ArrayList facLastNames = new ArrayList();
        ArrayList stuLastNames = new ArrayList();
        String lastName;
        for (int i = 0; i < numberOfDudes[0]; i++) 
        {
            cEmpLastNames.add(cEmployee[i].getLastName());
        }
        for (int i = 0; i < numberOfDudes[1]; i++) 
        {
            facLastNames.add(faculty[i].getLastName());
        }
        for (int i = 0; i < numberOfDudes[2]; i++) 
        {
            stuLastNames.add(student[i].getLastName());
        }
        do 
        {
            System.out.print("\nPlease enter the last name of the person you are looking for or type \"QUIT\" to go back to main menu: ");
            lastName = in.nextLine().toUpperCase();
            if (cEmpLastNames.contains(lastName)) 
            {
                for (int i = 0; i < numberOfDudes[0]; i++) 
                {
                    if (cEmployee[i].getLastName().equals(lastName)) 
                    {
                        cEmployee[i].displayAll();
                    }
                }
            } else if (facLastNames.contains(lastName)) 
            {
                for (int i = 0; i < numberOfDudes[1]; i++) 
                {
                    if (faculty[i].getLastName().equals(lastName)) 
                    {
                        faculty[i].displayAll();
                    }
                }
            } else if (stuLastNames.contains(lastName)) 
            {
                for (int i = 0; i < numberOfDudes[2]; i++) 
                {
                    if (student[i].getLastName().equals(lastName)) 
                    {
                        student[i].displayAll();
                    }
                }
            } else if (!cEmpLastNames.contains(lastName) && !facLastNames.contains(lastName) && !stuLastNames.contains(lastName) && !lastName.equals("QUIT")) 
            {
                System.out.println("\nYour search generated no results.");
            }
        } while (!lastName.equals("QUIT"));
    }
    public void displayAll() 
    {
        boolean isValid;
        int selection;
        do {
            isValid = true;
            
            System.out.println("\nPlease select a category to display: ");
            System.out.println("1. College Employee\n2. Faculty\n3. Student\n4. Back");
            selection = Integer.valueOf(in.nextLine());
            switch (selection) 
            {
                case 1:
                    for (int i = 0; i < numberOfDudes[0]; i++) 
                    {
                        cEmployee[i].displayAll();
                    }
                    break;
                case 2:
                    for (int i = 0; i < numberOfDudes[1]; i++) 
                    {
                        faculty[i].displayAll();
                    }
                    break;
                case 3:
                    for (int i = 0; i < numberOfDudes[2]; i++)
                    {
                        student[i].displayAll();
                    }
                case 4:
                    break;
                default:
                    System.out.println("\nThat is not a possible selection. Please try again.");
                    isValid = false;
                    break;
            }
        } while (!isValid);
    }
}