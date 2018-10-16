package kodra_guesstheword;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Besian Kodra
 */
public class RunApp
{
    public static String[] myWords = {"dogs", "justice", "prison", "computer", "byte",
        "radio", "piloted", "strange", "swipe", "left"};
    
    public String gameWord;
    public static String x = "";
    public static boolean matchWin;
    public static int numCharsInWord;
    public static int guessCount = 0;
    public static char letterInPlay;
    
    public void Run()
    {
        String again = "";
        do {
            x = "";
            Scanner input = new Scanner(System.in);
            Player p = new Player();
            BoardView b = new BoardView();
            Introduction intro = new Introduction();
            RunApp con = new RunApp();
            MatchData data = new MatchData();
            intro.displayInstructions();
            b.promptStart();

            char letter = p.receivePlayerInput();
            con.getGameWord();
            b.setupGameBoard(numCharsInWord);

            ArrayList gameArray = con.buildWordArray();
            ArrayList cloneArray = con.buildWordArray();
            ArrayList<MatchData> wrongGuesses = new ArrayList<MatchData>();
            ArrayList<MatchData> match;
            boolean misMatchFlag;
            MatchData misMatch;
            ArrayList<String> wrongLetters = new ArrayList<String>();

            while (guessCount < 8 && !"Win".equals(x)) 
            {
                if (isWon(p) != true) 
                {
                    letter = p.playGame();
                    match = p.checkWordForMatch(gameArray, cloneArray, letter);
                    b.updateBoard(match);
                    misMatch = p.checkWordForMisMatch(gameArray, letter);
                    misMatchFlag = misMatch.getIndex() == -1;
                    wrongGuesses.add(misMatch);

                    if (misMatchFlag) {
                        if (wrongLetters.contains(String.valueOf(letter))) 
                        {
                            System.out.println("\nYou've already guessed letter: " + letter);
                        }
                        b.displayWrongGuesses(wrongGuesses);
                        for (int i = 0; i < wrongGuesses.size(); i++) {
                            wrongLetters.add(wrongGuesses.get(i).getGuess());
                        }
                    }
                    match.clear();
                    if (guessCount > 7) 
                    {
                        System.out.println("\nYou lose! Game over.");
                        System.out.println("\nWould you like to play again? Y or N");
                        again = input.nextLine().toUpperCase();
                        guessCount = 0;
                    }
                } 
                else 
                {
                    System.out.println("\nYou win! Congrats!");
                    System.out.println("\nDo you want to play again? Y or N");
                    again = input.nextLine().toUpperCase();
                    guessCount = 0;
                }
            }
        } 
        while (again.equals("Y"));
    }
        public static boolean isWon(Player player) 
    {
        if (numCharsInWord == player.numMatches) 
        {
            x = "Win";
            return true;
        } else {
            return false;
        }
    }
    public void getGameWord() 
    {
        Random randy = new Random();
        int wordIndex = 1 + randy.nextInt(10);
        gameWord = myWords[wordIndex - 1];
        numCharsInWord = gameWord.length();
        System.out.println(numCharsInWord);
    }
    public ArrayList<String> buildWordArray() 
    {
        ArrayList<String> gameWordSubstrings = new ArrayList<String>();
        for (int i = 0; i < gameWord.length(); i++) 
        {
            gameWordSubstrings.add(gameWord.substring(i, i + 1));
        }
        return gameWordSubstrings;
    }
}
