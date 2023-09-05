package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String userName;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static boolean correctAnswerCheck(int answer, int correctAnswer) {
        boolean a;
        if (answer == correctAnswer) {
            System.out.println("Correct!");
            a = true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            a = false;
        }
        return a;
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
