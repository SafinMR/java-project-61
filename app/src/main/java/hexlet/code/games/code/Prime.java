package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String getNumber() {
        final int bound = 100;
        int randomNum = new Random().nextInt(bound);
        boolean check = isPrime(randomNum);
        System.out.println("Question: " + randomNum);
        System.out.print("Your answer: ");

        if (check) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void playPrime() {
        Scanner scanner = new Scanner(System.in);

        Engine.description("prime");

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
