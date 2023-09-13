package hexlet.code.games.code;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    static String[] getArray(int length) {
        final int bound1 = 100;
        final int bound2 = 20;
        int firstNum = new Random().nextInt(bound1);
        int diff = new Random().nextInt(bound2);

        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(firstNum + i * diff);
        }
        return progression;
    }

    public static void playProgression() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");
        int correctAnswerCount = 0;
        while (correctAnswerCount < 3) {
            final int min = 5;
            final int max = 5;
            int length = new Random().nextInt(min) + max;
            String[] progression = getArray(length);

            int bound = length - 1;
            int misNum = new Random().nextInt(bound);
            String correctAnswer = progression[misNum];
            progression[misNum] = "..";

            System.out.print("Question: ");
            for (int i = 0; i < length; i++) {
                System.out.print(progression[i] + " ");
            }
            System.out.println();
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
