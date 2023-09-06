package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static boolean isSimple(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void playPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correctAnswerCount = 0;

        while (correctAnswerCount < 3) {
            int randomNum = new Random().nextInt(100);
            boolean check = isSimple(randomNum);
            String correctAnswer;

            if (check) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (Engine.correctAnswerCheck(answer, correctAnswer)) {
                correctAnswerCount++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
        scanner.close();
    }
}
