package tip;
import java.util.Scanner;
/**
 * Besian Kodra
 * ITDEV 140-200
 */
public class Tip 
{
    public static void main(String[] args) 
    {
        Admin admin = new Admin();
        Scanner in = new Scanner(System.in);
        String x;
        startUI start = new startUI();
       do
       {
           start.startMethod();
           System.out.println("████████████████████████████████████████████████████████████████████████");
           System.out.println("If you would like to calculate another tip, please enter Y in the next field and hit the Enter key.\n"
                    + "Or press the Enter key twice to exit the app.");
            x = in.nextLine();
            System.out.println("████████████████████████████████████████████████████████████████████████");
       }
       while ("y".equals(x));
        admin.goodBye();
    }
}