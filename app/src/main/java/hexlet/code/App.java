package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        choice = (char) System.in.read();
        System.out.println("Your choice: " + choice + "\n");

        switch (choice) {
            case '1' -> Cli.greeting();
            case '2' -> {
                Even.playEven();
            }
            case '3' -> {
                Calc.playCalc();
            }
            case '4' -> {
                GCD.playGCD();
            }
            case '5' -> {
                Progression.playProgression();
            }
            case '6' -> {
                Prime.playPrime();
            }
            default -> {
            }
        }
    }
}
