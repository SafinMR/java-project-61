package hexlet.code.games.code;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    static String getExpression(String[] progression) {
        StringBuilder array = new StringBuilder();
        for (String s : progression) {
            array.append(s).append(" ");
        }
        return String.valueOf(array);
    }

    public static void playProgression() {
        String rule = "What number is missing in the progression?";
        final int min = 5;
        final int max = 5;
        final int bound1 = 100;
        final int bound2 = 20;
        String[] expression = new String[3];
        String[] correctAnswer = new String[3];
        for (int i = 0; i < 3; i++) {
            int length = Util.getRandomNum(min) + max;
            int firstNum = Util.getRandomNum(bound1);
            int diff = Util.getRandomNum(bound2);
            String[] progression = new String[length];

            for (int j = 0; j < length; j++) {
                progression[j] = String.valueOf(firstNum + j * diff);
            }

            int bound = length - 1;
            int missNum = Util.getRandomNum(bound);
            correctAnswer[i] = progression[missNum];
            progression[missNum] = "..";
            expression[i] = getExpression(progression);
        }
        Engine.play(rule, expression, correctAnswer);
    }
}
