package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final int BOUND = 100;
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void playPrime() {
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            examplesAndAnswers[i][0] = String.valueOf(Util.getRandomNum(BOUND));
            examplesAndAnswers[i][1] = isPrime(Integer.parseInt(examplesAndAnswers[i][0])) ? "yes" : "no";
        }
        Engine.play(RULE, examplesAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
