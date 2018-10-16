package kodra_grocerylist;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * @author Besian Kodra || ITDEV140
 */
public class DeleteItem 
{
    JFrame frame = new JFrame();
    Scanner in = new Scanner(System.in);
    Setup setup = new Setup();
    String item;

    public ArrayList<String> deleteAnItem(ArrayList<String> list, String errorMsg) 
    {
        String deleteMore;

        do 
        {
            setup.seperator();
            System.out.println("What would you like to delete from the grocery list?");
            item = in.nextLine().toUpperCase();

            if (list.contains(item)) 
            {
                list.remove(item);
                JOptionPane.showMessageDialog(frame, item + " was deleted!");
            } else 
            {
                System.out.println(item + " is not on the grocery list!");
            }
            System.out.println("Would you like to delete more? (Y)es or (N)o");
            deleteMore = in.nextLine().toUpperCase();
            while ((!deleteMore.equals("Y")) && (!deleteMore.equals("N"))) 
            {
                System.out.println(errorMsg);
                deleteMore = in.nextLine().toUpperCase();
            }
        } while (deleteMore.equals("Y"));

        return list;
    }
}
