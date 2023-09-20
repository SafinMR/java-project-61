package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    static int solution(int randomSign, int num1, int num2) {
        String[] sign = {"+", "-", "*"};
        int a = 0;

        System.out.println("Question: " + num1 + " " + sign[randomSign] + " " + num2);
        if (randomSign == 0) {
            a = num1 + num2;
        }
        if (randomSign == 1) {
            a = num1 - num2;
        }
        if (randomSign == 2) {
            a = num1 * num2;
        }
        return a;
    }
    static int getExpression() {
        final int bound1 = 100;
        final int bound2 = 10;
        final int signNum = 3;
        int randomNum1 = new Random().nextInt(bound1);
        int randomNum2 = new Random().nextInt(bound2);
        int randomSign = new Random().nextInt(signNum);
        int correctAnswer;

        correctAnswer = solution(randomSign, randomNum1, randomNum2);

        return correctAnswer;
    }

    public static void playCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        String correctAnswer;
        int correctAnswerCount = 0;

        final int correctAnswerLimit = 3;
        while (correctAnswerCount < correctAnswerLimit) {
            String answer;

            correctAnswer = String.valueOf(getExpression());
            System.out.print("Your answer: ");
            answer = scanner.next();
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
