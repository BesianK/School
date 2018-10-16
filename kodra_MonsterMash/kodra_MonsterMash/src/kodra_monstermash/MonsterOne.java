package kodra_monstermash;

import java.util.Random;
/**
 * @author besian kodra
 */
public class MonsterOne extends Monster 
{   
    Monster create = new Monster();
    Random rand = new Random();
    public String firstName;
    public String lastName;
    public String monsterType;
    public int statTotal;
    public int sizeBoost = rand.nextInt(7)+1;
    public int speedDamper = rand.nextInt(9)+1;
    
    public void mC1()
    {
        create.setSpeed(rand.nextInt(25) - speedDamper);
        create.setScareFactor((rand.nextInt(15) + 1));
        create.setSize(rand.nextInt(10) + sizeBoost);
        create.setStatTotal(create.getSize() + create.getSpeed() + create.getScareFactor());
        System.out.println("This Monster one stats:");
        System.out.println("Speed: " + create.getSpeed() + " Mph");
        System.out.println("Size: " + create.getSize() + " Ft");
        System.out.println("Scare Factor: " + create.getScareFactor());
        System.out.println("Stat total: " + create.getStatTotal());
    }
    public MonsterOne(String type, String first, String last, int sT)
    {
        monsterType = type;
        firstName = first;
        lastName = last;
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