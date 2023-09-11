package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static String getNumber() {
        int max = 100;
        int randomNum = new Random().nextInt(max);
        boolean check = randomNum % 2 == 0;
        System.out.println("Question: " + randomNum);
        System.out.print("Your answer: ");

        if (check) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static void playEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswerCount = 0;
        while (correctAnswerCount < 3) {
            String correctAnswer = getNumber();

            String answer = scanner.next();

            if (Engine.correctAnswerCheck(answer, correctAnswer)) {
                correctAnswerCount++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.getUserName() + "!");
        scanner.close();
    }
}
