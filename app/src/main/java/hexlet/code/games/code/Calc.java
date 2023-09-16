package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    static int getExpression() {
        String sign;
        final int bound1 = 100;
        final int bound2 = 10;
        final int signNum = 3;
        int randomNum1 = new Random().nextInt(bound1);
        int randomNum2 = new Random().nextInt(bound2);
        int randomSign = new Random().nextInt(signNum);
        int correctAnswer = 0;

        if (randomSign == 0) {
            sign = "*";
            correctAnswer = randomNum1 * randomNum2;
            System.out.println("Question: " + randomNum1 + " " + sign + " " + randomNum2);
        }
        if (randomSign == 1) {
            sign = "-";
            correctAnswer = randomNum1 - randomNum2;
            System.out.println("Question: " + randomNum1 + " " + sign + " " + randomNum2);
        }
        if (randomSign == 2) {
            sign = "+";
            correctAnswer = randomNum1 + randomNum2;
            System.out.println("Question: " + randomNum1 + " " + sign + " " + randomNum2);
        }
        return correctAnswer;
    }

    public static void playCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        int correctAnswer;
        int correctAnswerCount = 0;

        while (correctAnswerCount < 3) {
            int answer;

            correctAnswer = getExpression();
            System.out.print("Your answer: ");
            answer = scanner.nextInt();
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
