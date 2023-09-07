package hexlet.code;

import hexlet.code.games.code.Calc;
import hexlet.code.games.code.Even;
import hexlet.code.games.code.GCD;
import hexlet.code.games.code.Progression;
import hexlet.code.games.code.Prime;

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
            case '1' -> Engine.greeting();
            case '2' -> {
                Engine.greeting();
                Even.playEven();
            }
            case '3' -> {
                Engine.greeting();
                Calc.playCalc();
            }
            case '4' -> {
                Engine.greeting();
                GCD.playGCD();
            }
            case '5' -> {
                Engine.greeting();
                Progression.playProgression();
            }
            case '6' -> {
                Engine.greeting();
                Prime.playPrime();
            }
            default -> {

            }
        }
    }
}
