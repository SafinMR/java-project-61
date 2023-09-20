package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String userName;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName() {
        return userName;
    }

    public static void description(String game) {
        if (game.equals("even")) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }
        if (game.equals("prime")) {
            System.out.println("Answer 'yes' if the number is prime. Otherwise answer 'no'.");
        }
    }

    public static boolean correctAnswerCheck(String answer, String correctAnswer) {
        boolean a;
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            a = true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            a = false;
        }
        return a;
    }
}
