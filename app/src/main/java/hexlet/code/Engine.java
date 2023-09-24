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

    public static void play(String rule, String[] expression, String[] correctAnswer) {
        Scanner scanner = new Scanner(System.in);
        final int questionNumber = 3;

        System.out.println(rule);

        int i = 0;
        while (i < questionNumber) {
            System.out.println("Question: " + expression[i]);
            System.out.print("Your answer: ");

            String answer;

            answer = scanner.next();

            String a = correctAnswer[i];
            if (answer.equals(a)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + a + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
