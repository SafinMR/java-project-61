package hexlet.code.games.code;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    static boolean isPrime(int number) {
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

    public static void playPrime() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int questionNumber = 3;
        final int bound = 100;

        String[] randomNum = new String[questionNumber];
        String[] correctAnswer = new String[questionNumber];

        for (int i = 0; i < questionNumber; i++) {
            randomNum[i] = String.valueOf(Util.getRandomNum(bound));

            boolean check = isPrime(Integer.parseInt(randomNum[i]));
            if (check) {
                correctAnswer[i] = "yes";
            } else {
                correctAnswer[i] = "no";
            }
        }
        Engine.play(rule, randomNum, correctAnswer);
    }
}
