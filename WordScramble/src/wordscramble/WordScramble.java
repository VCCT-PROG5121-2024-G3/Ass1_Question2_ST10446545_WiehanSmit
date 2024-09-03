package wordscramble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/** 
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */ 
//------------------------------------------------------------------------------
//Game class representing a generic game
class Game {
    private String playerName;
    protected int maxAttempts;
    protected ArrayList<String> attempts;
    //--------------------------------------------------------------------------
    //Custom Constructor
    public Game(String playerName, int maxAttempts) {
        this.playerName = playerName;
        this.maxAttempts = maxAttempts;
        this.attempts = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void addAttempt(String attempt) {
        attempts.add(attempt);
    }

    public ArrayList<String> getAttempts() {
        return attempts;
    }
    //--------------------------------------------------------------------------
    //Displays final attempts report
    public void displayReport() {
        System.out.println("Game Report for " + playerName);
        System.out.println("Total Attempts: " + attempts.size());
        for (int i = 0; i < attempts.size(); i++) {
            System.out.println("Attempt " + (i + 1) + ": " + attempts.get(i));
        }
    }
}
//------------------------------------------------------------------------------
//Derived class representing the Word Scramble Game
class WordScrambleGame extends Game 
{
    private List<String> words;
    private String currentWord;
    private String scrambledWord;

    public WordScrambleGame(String playerName, int maxAttempts) 
    {
        super(playerName, maxAttempts);
        this.words = new ArrayList<>();
        populateWords();
        selectRandomWord();
        this.scrambledWord = scrambleWord(currentWord);
    }
//------------------------------------------------------------------------------
    //The list of words
    private void populateWords() {
        words.add("programming");
        words.add("inheritance");
        words.add("polymorphism");
        words.add("encapsulation");
        words.add("abstraction");
        words.add("constructor");
        words.add("interface");
    }
//------------------------------------------------------------------------------
    //Method to select a random word from the list
    private void selectRandomWord() {
        Random random = new Random();
        this.currentWord = words.get(random.nextInt(words.size()));
    }
    //--------------------------------------------------------------------------
    //Method to scramble the selected word
    private String scrambleWord(String word) {
        List<Character> characters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);
        StringBuilder scrambled = new StringBuilder();
        for (char c : characters) {
            scrambled.append(c);
        }
        return scrambled.toString();
    }
    //--------------------------------------------------------------------------
    public void playGame() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + getPlayerName() + "! Unscramble the following word: " + scrambledWord);

        while (attempts.size() < maxAttempts) 
        {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();
            addAttempt(guess);

            if (guess.equalsIgnoreCase(currentWord)) 
            {
                System.out.println("Congratulations! You guessed the correct word: " + currentWord);
                break;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }

            if (attempts.size() == maxAttempts) 
            {
                System.out.println("You've reached the maximum number of attempts. The correct word was: " + currentWord);
            }
        }

        displayReport();
    }
}
//------------------------------------------------------------------------------
//Main class to run the application
public class WordScramble
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        int maxAttempts = 5;
        WordScrambleGame game = new WordScrambleGame(playerName, maxAttempts);
        game.playGame();
    }
}
//-----------------------------End of File--------------------------------------