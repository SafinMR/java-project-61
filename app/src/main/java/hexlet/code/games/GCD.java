package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final int BOUND_1 = 100;
    private static final int BOUND_2 = 10;
    private static final String RULE = "Find the greatest common divisor of given numbers.";


    public static void playGCD() {
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            int randomNum1 = Util.getRandomNum(BOUND_1);
            int randomNum2 = Util.getRandomNum(BOUND_2);
            examplesAndAnswers[i][0] = randomNum1 + " " + randomNum2;
            examplesAndAnswers[i][1] = String.valueOf(getGCD(randomNum1, randomNum2));
        }
        Engine.play(RULE, examplesAndAnswers);
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
