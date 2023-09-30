package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final int BOUND_1 = 100;
    private static final int BOUND_2 = 10;
    private static final int SIGN_NUM = 3;

    public static void playCalc() {
        String rule = "What is the result of the expression?";
        String[] sign = {"+", "-", "*"};
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            int randomNum1 = Util.getRandomNum(BOUND_1);
            int randomNum2 = Util.getRandomNum(BOUND_2);
            int randomSign = Util.getRandomNum(SIGN_NUM);

            examplesAndAnswers[i][0] = randomNum1 + " " + sign[randomSign] + " " + randomNum2;
            examplesAndAnswers[i][1] = String.valueOf(calculate(sign[randomSign], randomNum1, randomNum2));
        }
        Engine.play(rule, examplesAndAnswers);
    }

    private static int calculate(String sign, int num1, int num2) {
        int a = 0;

        switch (sign) {
            case "+" -> {
                a = num1 + num2;
            }
            case "-" -> {
                a = num1 - num2;
            }
            case "*" -> {
                a = num1 * num2;
            }
            default -> {
                System.out.println("Something wrong!");
            }
        }
        return a;
    }
}
