package hexlet.code;

import java.util.Random;

public class Util {
    public static int getRandomNum(int bound) {
        return new Random().nextInt(bound);
    }
}
