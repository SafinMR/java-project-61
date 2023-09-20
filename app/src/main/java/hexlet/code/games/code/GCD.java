package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    static String getGCD() {
        final int bound1 = 100;
        final int bound2 = 10;
        int randomNum1 = new Random().nextInt(bound1);
        int randomNum2 = new Random().nextInt(bound2);
        int answer = 1;
        if (randomNum1 == 0) {
            answer = randomNum2;
            return String.valueOf(answer);
        }
        if (randomNum2 == 0) {
            answer = randomNum1;
            return String.valueOf(answer);
        }
        int a = Math.min(randomNum1, randomNum2);
        for (int i = 1; i <= a; i++) {
            boolean n1 = randomNum1 % i == 0;
            boolean n2 = randomNum2 % i == 0;
            boolean n = n1 & n2;
            if (n) {
                answer = i;
            }
        }

        System.out.println("Question: " + randomNum1 + " " + randomNum2);
        return String.valueOf(answer);
    }

    public static void playGCD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswerCount = 0;
        final int correctAnswerLimit = 3;
        while (correctAnswerCount < correctAnswerLimit) {
            String correctAnswer;
            correctAnswer = getGCD();
            System.out.print("Your answer: ");
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
