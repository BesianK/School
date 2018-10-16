package tip;
/**
 * Besian Kodra
 * ITDEV 140-200
 */
public class startUI 
{
    public void startMethod()
    {
        Admin admin = new Admin();
        admin.intro();
        
        Calc userInput = new Calc();
             userInput.inScreen();
             userInput.tipCalc();
             userInput.totalBill();
    }
}
