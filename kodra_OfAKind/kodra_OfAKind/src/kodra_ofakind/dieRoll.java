
package kodra_ofakind;

import java.util.Random;
public class dieRoll 
{
    int DIE_SIDE = 6, NUM_OF_DIE = 5;
    int[] dieValue = new int[NUM_OF_DIE];
    int ones, twos, threes, fours, fives, sixes;

    public void setOnes(int ones) 
    {
        this.ones = ones;
    }

    public void setTwos(int twos) 
    {
        this.twos = twos;
    }

    public void setThrees(int threes) 
    {
        this.threes = threes;
    }

    public void setFours(int fours) 
    {
        this.fours = fours;
    }

    public void setFives(int fives) 
    {
        this.fives = fives;
    }

    public void setSixes(int sixes) 
    {
        this.sixes = sixes;
    }

    public int getOnes() 
    {
        return ones;
    }

    public int getTwos() 
    {
        return twos;
    }

    public int getThrees() 
    {
        return threes;
    }

    public int getFours() 
    {
        return fours;
    }

    public int getFives() 
    {
        return fives;
    }

    public int getSixes() 
    {
        return sixes;
    }
    int winLose, highestFace;

    public void setHighestFace(int highestFace) 
    {
        this.highestFace = highestFace;
    }

    public int getHighestFace() 
    {
        return highestFace;
    }

    public void setWinLose(int winLose) 
    {
        this.winLose = winLose;
    }

    public int getWinLose() 
    {
        return winLose;
    }

    public void roll() 
    {
        Random rand = new Random();
        for (Integer i = 0; i < dieValue.length; i++) 
        {
            dieValue[i] = rand.nextInt(DIE_SIDE) + 1;
            System.out.println("Die " + (i + 1) + ": " + dieValue[i]);
            findingMatches(dieValue[i]);
        }
    }

    private void findingMatches(int dieFace) 
    {

        if (dieFace == 1) 
        {
            ones += 1;
        } else if (dieFace == 2) 
        {
            twos += 1;
        } else if (dieFace == 3) 
        {
            threes += 1;
        } else if (dieFace == 4) 
        {
            fours += 1;
        } else if (dieFace == 5) 
        {
            fives += 1;
        } else if (dieFace == 6) 
        {
            sixes += 1;
        }
    }

    public void highestDieVal() 
    {
        int[] diceValue = {ones, twos, threes, fours, fives, sixes};
        int mostMatches = diceValue[0];
        for (int i = 1; i < diceValue.length; i++) 
        {
            if (diceValue[i] > mostMatches) 
            {
                mostMatches = diceValue[i];
            }
        }
        getHighestFace(mostMatches);
        displayDiceInfo(mostMatches);
    }

    public void getHighestFace(int highestDie) 
    {

        if (highestDie == ones) 
        {
            highestFace = 1;
        } 
        else if (highestDie == twos) 
        {
            highestFace = 2;
        } 
        else if (highestDie == threes) 
        {
            highestFace = 3;
        } 
        else if (highestDie == fours) 
        {
            highestFace = 4;
        } 
        else if (highestDie == fives) 
        {
            highestFace = 5;
        } 
        else if (highestDie == sixes) 
        {
            highestFace = 6;
        }
    }

    public void displayDiceInfo(int highest) {
        String ofAKind = "";

        if (highest == 1) 
        {
            winLose = 0;
            ofAKind = "No matches.";
        } 
        else if (highest == 2) 
        {
            winLose = 1;
            ofAKind = "Two of a kind!";
        } 
        else if (highest == 3) 
        {
            winLose = 2;
            ofAKind = "Three of a kind!";
        } 
        else if (highest == 4) 
        {
            winLose = 3;
            ofAKind = "Four of a kind!";
        } 
        else if (highest == 5) 
        {
            winLose = 4;
            ofAKind = "Five of a kind!";
        }

        System.out.println(ofAKind);
    }
}
