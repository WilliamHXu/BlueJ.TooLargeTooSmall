
/**
 * Write a description of class Main here.
 *
 * @author Will Xu
 * @version 2/5/18
 */

import java.util.Scanner;

public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        Scanner scanner = new Scanner(System.in);
        int answer = randomNumberGen();
        int guess = 1001;
        int lastGuess = 1001;
        int nog = 0;
        System.out.println("Welcome to Will's Guessing Game");
        System.out.println("Please Make a Guess Between 1 and 1000 Inclusive");
        while (answer != guess) {
            lastGuess = guess;
            guess = scanner.nextInt();
            if (guess == lastGuess) {nog--;}
            if (guess > answer) {
                System.out.println("Too High You Fool, You Want to Kill Us?");
            }
            if (guess < answer) {
                System.out.println("Too Low! Are You Afraid to Guess High or What?");
            }
            if (guess == answer) {
                System.out.println("Crap.... Fine You Got It... Congrats I Guess.");
            }
            nog++;
    }
    System.out.println("You Guessed It Right in " + nog + " times!");
}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public Integer randomNumberGen() {
        int x = (int) Math.ceil(Math.random() * 1000);
        return x;
    }
}
