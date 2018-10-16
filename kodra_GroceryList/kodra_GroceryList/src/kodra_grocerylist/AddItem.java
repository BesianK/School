package kodra_grocerylist;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * @author Besian Kodra || ITDEV140
 */
public class AddItem 
{
    JFrame frame = new JFrame();
    Scanner in = new Scanner(System.in);
    Setup setup = new Setup();
    String item;

    public ArrayList<String> addAnItem(ArrayList<String> list, String errorMsg) 
    {
        String addMore;

        do 
        {
            setup.seperator();
            System.out.println("What would you like to add to the list?");
            item = in.nextLine().toUpperCase();

            if (list.contains(item)) 
            {
                System.out.println(item + " is already on the list!");
            } else 
            {
                list.add(item);
                JOptionPane.showMessageDialog(frame, item + " was added!");
            }
            System.out.println("Would you like to add more? (Y)es or (N)o");
            addMore = in.nextLine().toUpperCase();
            while ((!addMore.equals("Y")) && (!addMore.equals("N"))) 
            {
                System.out.println(errorMsg);
                addMore = in.nextLine().toUpperCase();
            }
        } while (addMore.equals("Y"));

        return list;
    }
}
