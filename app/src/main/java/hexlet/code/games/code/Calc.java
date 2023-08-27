package hexlet.code.games.code;

import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void playCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");


        int result;
        int correctAnswerCount = 0;

        while (correctAnswerCount < 3) {
            int randomNum1;
            int randomNum2;
            int answer;

            int randomSing = new Random().nextInt(3);

            switch (randomSing) {
                case 0:
                    randomNum1 = (int) (Math.random() * 100);
                    randomNum2 = (int) (Math.random() * 10);
                    System.out.println("Question: " + randomNum1 + " * " + randomNum2);
                    result = randomNum1 * randomNum2;
                    System.out.print("Answer:  ");
                    answer = scanner.nextInt();
                    if (answer == result) {
                        System.out.println("Correct!");
                        correctAnswerCount++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                        System.out.println("Let's try again, " + Engine.userName + "!");
                        return;
                    }
                case 1:
                    randomNum1 = (int) (Math.random() * 100);
                    randomNum2 = (int) (Math.random() * 10);
                    System.out.println("Question: " + randomNum1 + " * " + randomNum2);
                    result = randomNum1 * randomNum2;
                    System.out.print("Answer:  ");
                    answer = scanner.nextInt();
                    if (answer == result) {
                        System.out.println("Correct!");
                        correctAnswerCount++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                        System.out.println("Let's try again, " + Engine.userName + "!");
                        return;
                    }
                case 2:
                    randomNum1 = (int) (Math.random() * 100);
                    randomNum2 = (int) (Math.random() * 10);
                    System.out.println("Question: " + randomNum1 + " * " + randomNum2);
                    result = randomNum1 * randomNum2;
                    System.out.print("Answer:  ");
                    answer = scanner.nextInt();
                    if (answer == result) {
                        System.out.println("Correct!");
                        correctAnswerCount++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                        System.out.println("Let's try again, " + Engine.userName + "!");
                        return;
                    }
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
        scanner.close();
    }
}
