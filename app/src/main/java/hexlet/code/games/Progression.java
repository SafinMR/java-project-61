package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int MIN = 5;
    private static final int MAX = 5;
    private static final int BOUND_1 = 100;
    private static final int BOUND_2 = 20;

    public static void playProgression() {
        String rule = "What number is missing in the progression?";
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            String[] progression = getProgression();

            int bound = progression.length - 1;
            int missNum = Util.getRandomNum(bound);
            int j = 0;

            String temp = progression[missNum];
            progression[missNum] = "..";
            examplesAndAnswers[i][j] = getString(progression);
            j++;
            examplesAndAnswers[i][j] = temp;
        }
        Engine.play(rule, examplesAndAnswers);
    }

    private static String[] getProgression() {
        int length = Util.getRandomNum(MIN) + MAX;
        int firstNum = Util.getRandomNum(BOUND_1);
        int diff = Util.getRandomNum(BOUND_2);
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(firstNum + i * diff);
        }
        return progression;
    }

    private static String getString(String[] progression) {
        StringBuilder array = new StringBuilder();

        for (String s : progression) {
            array.append(s).append(" ");
        }
        return String.valueOf(array);
    }
}
