package hexlet.code;

import hexlet.code.games.code.Calc;
import hexlet.code.games.code.Even;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "0 - Exit");
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
            default -> {

            }
        }
    }
}
