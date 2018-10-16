package kodra_grocerylist;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Besian Kodra || ITDEV140
 */
public class Constructor 
{
    public void Constructor()
            throws IOException, ClassNotFoundException 
    {
        Setup setup = new Setup();
        AddItem add = new AddItem();
        DisplayList display = new DisplayList();
        DeleteItem delete = new DeleteItem();
        ClearList empty = new ClearList();
        String groceryList = "groceries.txt";
        ArrayList<String> theList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int userSelection;
        String exitCont = "";
        String error = "That was an invalid selection. Please try again";

        setup.intro();

        File f = new File(groceryList);

        if (f.exists()) 
        {
            ObjectInputStream inFile = new ObjectInputStream(
                    new FileInputStream(f));
            theList = (ArrayList<String>) inFile.readObject();
            inFile.close();
        }

        do 
        {
            setup.seperator();
            System.out.println("1. Display List\n2. Add Items\n3. Delete Items\n4. Clear List\n5. Exit");
            System.out.println("Please enter the number of what you would like to do: ");
            while (true) 
            {
                try 
                {
                    userSelection = Integer.parseInt(in.nextLine());
                    break;
                } catch (NumberFormatException e) 
                {
                    System.out.println(error);
                }
            }

            switch (userSelection) 
            {
                case 1:
                    display.displayAll(theList);
                    break;
                case 2:
                    theList = add.addAnItem(theList, error);
                    break;
                case 3:
                    theList = delete.deleteAnItem(theList, error);
                    break;
                case 4:
                    theList = empty.emptyList(theList);
                    break;
                case 5:
                    exitCont = setup.msgBxExit();
                    break;
                default:
                    System.out.println(error);
            }
        } while (!exitCont.equals("exit"));

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(groceryList));

        out.writeObject(theList);

        out.close();

        setup.goodbye();

        System.exit(0);
    }
}
