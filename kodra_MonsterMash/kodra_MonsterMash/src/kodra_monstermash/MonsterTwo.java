package kodra_monstermash;

import java.util.Random;
/**
 * @author besian kodra
 */
public class MonsterTwo extends Monster
{
    Monster create = new Monster();
    Random rand = new Random();
    public String firstName;
    public String lastName;
    public String monsterType;
    public int sttTotal;
    public int speedBoost = rand.nextInt(7)+1;
    public int sizeDamper = rand.nextInt(3)+1;
    
    public void mC2()
    {
        create.setSpeed(rand.nextInt(25) + speedBoost);
        create.setScareFactor((rand.nextInt(15) + 1));
        create.setSize(rand.nextInt(10) - sizeDamper);
        create.setStatTotal(create.getSize() + create.getSpeed() + create.getScareFactor());
        System.out.println("This Monster two stats:");
        System.out.println("Speed: " + create.getSpeed() + " Mph.");
        System.out.println("Size: " + create.getSize() + " Ft.");
        System.out.println("Scare Factor: " + create.getScareFactor());
        System.out.println("Stat total: " + create.getStatTotal());
    }
    public MonsterTwo(String type, String first, String last, int sT)
    {
        firstName = first;
        lastName = last;
        monsterType = type;
        statTotal = sT;
    }
    public String getFirstName() 
    {
        return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public String getMonsterType() 
    {
        return monsterType;
    }
    public void setMonsterType(String monsterType)
    {
        this.monsterType = monsterType;
    }
}
