package kodra_grocerylist;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * @author Besian Kodra || ITDEV140
 */
public class Setup 
{
    JFrame frame = new JFrame();

    public void intro() 
    {
        System.out.println("Welcome to Besian's Grocery List App! This app will allow you to "
                + "\ncreate and save your grocery list by adding and deleting items you need. "
                + "\nYou may also display all items in your list. After you are finished, "
                + "\nyour list will be saved and you may come back and update your "
                + "\nlist whenever you'd like. When you finish your grocery shopping"
                + "\nyou can clear the list to start a new grocery list.");
        System.out.println("Press ENTER to continue...");
        try 
        {
            System.in.read();
        } catch (Exception e) 
        {

        }
    }
    public void seperator() 
    {
        for (int i = 0; i < 60; i++) 
        {
            System.out.print('*');
        }
        System.out.println();
    }
    public void goodbye() 
    {
        JOptionPane.showMessageDialog(frame, "Your list will be saved.");
    }
    public String msgBxExit() 
    {
        int result;
        String loop = "";
        result = JOptionPane.showConfirmDialog(frame,
                "Are you sure you want to quit?",
                "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) 
        {
            loop = "exit";
        } else if (result == JOptionPane.NO_OPTION) 
        {
            loop = "continue";
        }
        return loop;
    }
}
