package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    static int operatorSelection(int randomSing, int randomNum1, int randomNum2) {
        String sign;
        int correctAnswer = 0;
        if (randomSing == 0) {
            sign = "*";
            correctAnswer = randomNum1 * randomNum2;
            System.out.println("Question: " + randomNum1 + " " + sign + " " + randomNum2);
        }
        if (randomSing == 1) {
            sign = "-";
            correctAnswer = randomNum1 - randomNum2;
            System.out.println("Question: " + randomNum1 + " " + sign + " " + randomNum2);
        }
        if (randomSing == 2) {
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
            int randomNum1 = new Random().nextInt(100);
            int randomNum2 = new Random().nextInt(10);
            int answer;
            int randomSing = new Random().nextInt(3);

            correctAnswer = operatorSelection(randomSing, randomNum1, randomNum2);
            System.out.print("Your answer: ");
            answer = scanner.nextInt();
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
