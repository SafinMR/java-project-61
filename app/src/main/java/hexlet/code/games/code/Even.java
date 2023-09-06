package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswerCount = 0;
        while (correctAnswerCount < 3) {
            int randomNum = new Random().nextInt(100);
            boolean check = randomNum % 2 == 0;
            String correctAnswer;

            if (check) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswerCount++;

            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Engine.userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
        scanner.close();
    }
}
