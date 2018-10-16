package kodra_monstermash;
import java.util.Scanner;
import java.util.Random;
/**
 * @author besian kodra
 */
public class Control 
{
    Admin Intro = new Admin();
    Random random = new Random();
    Monster create = new Monster();
    Scanner selection = new Scanner(System.in);
    MonsterOne mC1 = new MonsterOne("Omnigul" , "Thorn" , "Mantis", create.getStatTotal());
    MonsterOne mC2 = new MonsterOne("Omnigul" , "Gjallarhorn" , "Archon", create.getStatTotal());
    MonsterOne mC3 = new MonsterOne("Omnigul" , "Hive" , "Shaxx", create.getStatTotal());
    MonsterTwo mC4 = new MonsterTwo("Crota" , "Calus", "Pahool", create.getStatTotal());
    MonsterTwo mC5 = new MonsterTwo("Crota" , "Skolas" , "Cryptarch", create.getStatTotal());
    MonsterTwo mC6 = new MonsterTwo("Crota" , "Aksis" , "Eris Morn", create.getStatTotal());
    public int m1Pick;
    public int m2Pick;
    public int m1;
    public int battleSelect;
            
    public void StartApp()
    {           
        Intro.Intro();        
    }
    public void meetTheMonsters()
    {
        
        System.out.println("Monster Type: " + mC1.getMonsterType() + "\tMonster's Name: " + mC1.getFirstName() + " " + mC1.getLastName());
        mC1.mC1();
        System.out.println("\nMonster Type: " + mC2.getMonsterType() + "\tMonster's Name: " + mC2.getFirstName() + " " + mC2.getLastName());
        mC2.mC1();
        System.out.println("\nMonster Type: " + mC3.getMonsterType() + "\tMonster's Name: " + mC3.getFirstName() + " " + mC3.getLastName());
        mC3.mC1();
        System.out.println("\nMonster Type: " + mC4.getMonsterType() + "\tMonster's Name: " + mC4.getFirstName() + " " + mC4.getLastName());
        mC4.mC2();
        System.out.println("\nMonster Type: " + mC5.getMonsterType() + "\tMonster's Name: " + mC5.getFirstName() + " " + mC5.getLastName());
        mC5.mC2();
        System.out.println("\nMonster Type: " + mC6.getMonsterType() + "\tMonster's Name: " + mC6.getFirstName() + " " + mC6.getLastName());
        mC6.mC2();
    }
    public void monsterMash()
    {   
        System.out.println("\n\n\tWould you like to see two monsters battle? \n\tPress 1 for Yes or 2 for no ");
        int select = selection.nextInt();
        
        if (select == 1)
        {
            System.out.println("\nMonster Type: " + mC3.getMonsterType() + "\nMonster's Name: " + mC3.getFirstName() + " " + mC3.getLastName());
            mC3.mC1();
            System.out.println("\nVs.");
            System.out.println("\nMonster Type: " + mC4.getMonsterType() + "\nMonster's Name: " + mC4.getFirstName() + " " + mC4.getLastName());
            mC4.mC2();
            if (mC3.create.getStatTotal() > mC4.create.getStatTotal())
            {
                System.out.println("\n\n\t" + mC3.getFirstName() + " " + mC3.getLastName() + " wins!");
            }
            if (mC3.create.getStatTotal() < mC4.create.getStatTotal())
            {
                System.out.println("\n\n\t" + mC4.getFirstName() + " " + mC4.getLastName() + " wins!");
            }
        }
        else
        {
            System.out.println("Thank you for playing my game!");
        }
    }
    public void endGame()
    {
        Intro.Outro();
    }
}
