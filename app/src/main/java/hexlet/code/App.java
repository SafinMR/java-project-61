package hexlet.code;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "0 - Exit");
        choice = (char) System.in.read();
        System.out.println("Your choice: " + choice);

        if (choice == '1') {
            Cli.setName();
        }
    }
}
