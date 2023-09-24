package hexlet.code.games.code;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    static int solution(int randomSign, int num1, int num2) {

        int a = 0;

        if (randomSign == 0) {
            a = num1 + num2;
        }
        if (randomSign == 1) {
            a = num1 - num2;
        }
        if (randomSign == 2) {
            a = num1 * num2;
        }
        return a;
    }

    public static void playCalc() {
        String rule = "What is the result of the expression?";
        final int questionNumber = 3;
        final int bound1 = 100;
        final int bound2 = 10;
        final int signNum = 3;
        String[] sign = {"+", "-", "*"};

        String[] correctAnswer = new String[questionNumber];
        String[] expression = new String[questionNumber];
        for (int i = 0; i < questionNumber; i++) {
            int randomNum1 = Util.getRandomNum(bound1);
            int randomNum2 = Util.getRandomNum(bound2);
            int randomSign = Util.getRandomNum(signNum);

            correctAnswer[i] = String.valueOf(solution(randomSign, randomNum1, randomNum2));
            expression[i] = randomNum1 + " " + sign[randomSign] + " " + randomNum2;
        }
        Engine.play(rule, expression, correctAnswer);
    }
}
