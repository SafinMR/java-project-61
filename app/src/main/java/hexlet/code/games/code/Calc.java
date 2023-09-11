package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    static int getExpression() {
        String sign;
        int randomNum1 = new Random().nextInt(100);
        int randomNum2 = new Random().nextInt(10);
        int randomSign = new Random().nextInt(3);
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
        int expressionNumber = 0;

        while (expressionNumber < 3) {
            int answer;

            correctAnswer = getExpression();
            System.out.print("Your answer: ");
            answer = scanner.nextInt();
            if (Engine.correctAnswerCheck(answer, correctAnswer)) {
                expressionNumber++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
        scanner.close();
    }
}
