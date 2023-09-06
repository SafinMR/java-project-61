package hexlet.code.games.code;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void playProgression() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");
        int correctAnswerCount = 0;
        while (correctAnswerCount < 3) {
            int length = new Random().nextInt(5) + 5;
            String[] progression = new String[length];
            int firstNum = new Random().nextInt(100);
            int diff = new Random().nextInt(20);

            for (int i = 0; i < length; i ++) {
                progression[i] = String.valueOf(firstNum + i * diff);
            }

            int misNum = new Random().nextInt(length - 1);
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
        System.out.println("Congratulations, " + Engine.userName + "!");
        scanner.close();
    }
}
