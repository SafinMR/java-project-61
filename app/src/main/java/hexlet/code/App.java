package hexlet.code;

import hexlet.code.games.code.*;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n" + "0 - Exit");
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
            default -> {

            }
        }
    }
}
