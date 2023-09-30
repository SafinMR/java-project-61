package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int MIN = 5;
    private static final int MAX = 5;
    private static final int BOUND_1 = 100;
    private static final int BOUND_2 = 20;
    private static final String RULE = "What number is missing in the progression?";


    public static void playProgression() {
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            int length = Util.getRandomNum(MIN) + MAX;
            int firstNum = Util.getRandomNum(BOUND_1);
            int diff = Util.getRandomNum(BOUND_2);

            String[] progression = getProgression(length, firstNum, diff);

            int bound = progression.length - 1;
            int missNum = Util.getRandomNum(bound);

            String temp = progression[missNum];
            progression[missNum] = "..";
            examplesAndAnswers[i][0] = getString(progression);
            examplesAndAnswers[i][1] = temp;
        }
        Engine.play(RULE, examplesAndAnswers);
    }

    private static String[] getProgression(int length, int firstNum, int diff) {
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
