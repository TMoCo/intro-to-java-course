package uk.co.bbc.tmoco.numberguesser;

import java.util.Scanner;

public class NumberGuess {
    static int generateRandomNumber () {
        return 1 + (int) (10.0f * Math.random());
    }

    public static void main(String[] args) {
        int guessCount = 0, target = generateRandomNumber();

        Scanner userInput = new Scanner(System.in);

        game:
        while (true) {
            System.out.println("Please enter a number between 1 and 10");
            int guess = userInput.nextInt();

            if (guess == -1) {
                System.out.printf("Enabled cheat mode, the guess is: %d.\n",
                        target);
                continue;
            }

            guessCount += 1;

            if (guess == target) {
                System.out.printf("Congratulations, you guessed the number in" +
                                " %d guess%s. Game Over.\n", guessCount,
                        (guessCount > 1 ? "es" : "")
                );

                playAgainPrompt:
                while (true) {
                    System.out.println("Play again? (yes/no)");
                    String answer = userInput.next();
                    switch (answer) {
                        case "yes" -> {
                            break playAgainPrompt;
                        }
                        case "no" -> {
                            break game;
                        }
                        default ->
                                System.out.println("Invalid answer, please " +
                                        "answer yes or no.");
                    }

                }
                guessCount = 0;
                target = generateRandomNumber();
                continue;
            }

            if (Math.abs(guess - target) == 1) {
                System.out.println("Close! You are within 1 of the guess.");
            }

            System.out.printf("Your guess was %s than the number. Guess " +
                    "again!\n", guess > target ? "higher" : "lower");

        }

        System.out.println("Thanks for playing, goodbye!");
    }

}
