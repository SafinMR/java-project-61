package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    static int getGCD() {
        int bound1 = 100;
        int bound2 = 10;
        int randomNum1 = new Random().nextInt(bound1);
        int randomNum2 = new Random().nextInt(bound2);
        int answer = 1;
        for (int i = 1; i <= randomNum1 && i <= randomNum2; i++) {
            if (randomNum1 % i == 0 && randomNum2 % i == 0) {
                answer = i;
            }
        }

        System.out.println("Question: " + randomNum1 + " " + randomNum2);
        return answer;
    }

    public static void playGCD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswerCount = 0;

        while (correctAnswerCount < 3) {
            int correctAnswer;
            correctAnswer = getGCD();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

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
