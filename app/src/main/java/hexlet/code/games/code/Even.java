package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static String getNumber() {
        final int bound = 100;
        int randomNum = new Random().nextInt(bound);
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
        String game = "even";

        Engine.description(game);

        int correctAnswerCount = 0;
        final int correctAnswerLimit = 3;
        while (correctAnswerCount < correctAnswerLimit) {
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
