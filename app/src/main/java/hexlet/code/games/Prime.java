package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final int BOUND = 100;

    public static void playPrime() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] examplesAndAnswers = new String[Engine.QUESTION_COUNT][Engine.COUPLES_COUNT];

        for (int i = 0; i < Engine.QUESTION_COUNT; i++) {
            int j = 0;

            examplesAndAnswers[i][j] = String.valueOf(Util.getRandomNum(BOUND));
            String temp = isPrime(Integer.parseInt(examplesAndAnswers[i][j])) ? "yes" : "no";
            j++;
            examplesAndAnswers[i][j] = temp;
        }
        Engine.play(rule, examplesAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
