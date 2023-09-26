package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTION_COUNT = 3;
    public static final int COUPLES_COUNT = 2;

    public static void play(String rule, String[][] examplesAndAnswers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        for (int i = 0; i < QUESTION_COUNT; i++) {
            int j = 0;
            System.out.println("Question: " + examplesAndAnswers[i][j]);
            System.out.print("Your answer: ");

            String answer;

            answer = scanner.next();

            j++;
            String a = examplesAndAnswers[i][j];

            if (answer.equals(a)) {
                System.out.println("Correct!");
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
