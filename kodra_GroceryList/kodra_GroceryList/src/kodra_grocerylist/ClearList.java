package kodra_grocerylist;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * @author Besian Kodra || ITDEV140
 */
public class ClearList 
{
    public ArrayList<String> emptyList(ArrayList<String> list) 
    {
        JFrame frame = new JFrame();
        int result;

        result = JOptionPane.showConfirmDialog(frame,
                "Are you sure you want to clear the list?",
                "Confirm Clear", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) 
        {
            list.clear();
        }
        return list;
    }
}
