package hexlet.code.games.code;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final int BOUND_1 = 100;
    private static final int BOUND_2 = 10;

    public static void playGCD() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] examplesAndAnswers = new String[Engine.QUESTION_NUMBER][Engine.PAIR_NUM];

        for (int i = 0; i < Engine.QUESTION_NUMBER; i++) {
            int randomNum1 = Util.getRandomNum(BOUND_1);
            int randomNum2 = Util.getRandomNum(BOUND_2);
            int j = 0;
            examplesAndAnswers[i][j] = randomNum1 + " " + randomNum2;
            j++;
            examplesAndAnswers[i][j] = String.valueOf(getGCD(randomNum1, randomNum2));
        }
        Engine.play(rule, examplesAndAnswers);
    }

    private static int getGCD(int num1, int num2) {
        int answer = 1;

        if (num1 == 0) {
            answer = num2;
            return answer;
        }
        if (num2 == 0) {
            answer = num1;
            return answer;
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
        return answer;
    }
}
