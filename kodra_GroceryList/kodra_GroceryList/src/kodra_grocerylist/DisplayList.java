package kodra_grocerylist;
import java.util.ArrayList;
/**
 * @author Besian Kodra || ITDEV140
 */
public class DisplayList 
{
    Setup setup = new Setup();

    public void displayAll(ArrayList<String> list) 
    {
        setup.seperator();
        System.out.println("---GROCERY LIST---");
        for (String item : list) 
        {
            System.out.println(item);
        }
    }
}
