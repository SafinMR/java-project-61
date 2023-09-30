package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int BOUND = 100;
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void playEven() {
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            examplesAndAnswers[i][0] = String.valueOf(Util.getRandomNum(BOUND));
            examplesAndAnswers[i][1] = isEven(Integer.parseInt(examplesAndAnswers[i][0])) ? "yes" : "no";
        }
        Engine.play(RULE, examplesAndAnswers);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
