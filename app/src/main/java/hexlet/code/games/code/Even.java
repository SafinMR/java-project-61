package hexlet.code.games.code;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void playEven() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int bound = 100;
        String[] randomNum = new String[3];
        String[] correctAnswer = new String[3];


        for (int i = 0; i < 3; i++) {
            randomNum[i] = String.valueOf(Util.getRandomNum(bound));
            boolean check = Integer.parseInt(randomNum[i]) % 2 == 0;
            if (check) {
                correctAnswer[i] = "yes";
            } else {
                correctAnswer[i] = "no";
            }
        }
        Engine.play(rule, randomNum, correctAnswer);
    }
}
