package hexlet.code.games.code;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    static int getGCD(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }

        if (n2 == 0) {
            return n1;
        }

        int n;
        for (n = 0; ((n1 | n2) & 1) == 0; n++) {
            n1 >>= 1;
            n2 >>= 1;
        }

        while ((n1 & 1) == 0) {
            n1 >>= 1;
        }

        do {
            while ((n2 & 1) == 0) {
                n2 >>= 1;
            }

            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            n2 = (n2 - n1);
        } while (n2 != 0);
        return n1 << n;
    }

    public static void playGCD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswerCount = 0;

        while (correctAnswerCount < 3) {
            int correctAnswer;
            int randomNum1 = (int) (Math.random() * 100);
            int randomNum2 = (int) (Math.random() * 10);

            correctAnswer = getGCD(randomNum1, randomNum2);

            System.out.println("Question: " + randomNum1 + " " + randomNum2);
            System.out.print("Answer:  ");
            int answer = scanner.nextInt();

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
