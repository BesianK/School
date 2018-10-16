package kodra_monstermash;

import java.util.Random;
/**
 * @author besian kodra
 */
public class Monster 
{
    Random rand = new Random();
    public String monsterType; 
    public String name; 
    public int scareFactor; 
    public int size; 
    public int speed;
    public int statTotal = speed + size + scareFactor;

    public String getMonsterType() 
    {
        return monsterType;
    }
    public void setMonsterType(String monsterType) 
    {
        this.monsterType = monsterType;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getScareFactor() 
    {
        return scareFactor;
    }
    public void setScareFactor(int scareFactor) 
    {
        this.scareFactor = scareFactor;
    }
    public int getSize() 
    {
        return size;
    }
    public void setSize(int size) 
    {
        this.size = size;
    }
    public int getSpeed() 
    {
        return speed;
    }
    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }
    public int getStatTotal() 
    {
        return statTotal;
    }
    public void setStatTotal(int statTotal) 
    {
        this.statTotal = statTotal;
    }
}
