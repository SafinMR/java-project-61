package hexlet.code.games.code;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    static String getGCD(int num1, int num2) {

        int answer = 1;
        if (num1 == 0) {
            answer = num2;
            return String.valueOf(answer);
        }
        if (num2 == 0) {
            answer = num1;
            return String.valueOf(answer);
        }
        int a = Math.min(num1, num2);
        for (int i = 1; i <= a; i++) {
            boolean n1 = num1 % i == 0;
            boolean n2 = num2 % i == 0;
            boolean n = n1 & n2;
            if (n) {
                answer = i;
            }
        }
        return String.valueOf(answer);
    }

    public static void playGCD() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[] randomNum = new String[3];
        String[] correctAnswer = new String[3];
        final int bound1 = 100;
        final int bound2 = 10;

        for (int i = 0; i < 3; i++) {
            int randomNum1 = Util.getRandomNum(bound1);
            int randomNum2 = Util.getRandomNum(bound2);
            randomNum[i] = randomNum1 + " " + randomNum2;
            correctAnswer[i] = getGCD(randomNum1, randomNum2);
        }
        Engine.play(rule, randomNum, correctAnswer);
    }
}
