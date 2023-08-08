package hexlet.code;

import java.util.Scanner;

class Even {
    public static void playEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");



        int correctAnswerCount = 0;
        while (correctAnswerCount < 3) {
            int randomNum = (int) (Math.random() * 100);
            boolean check = randomNum % 2 == 0;
            String correctAnswer;

            if (check) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.println("Question: " + randomNum);
            System.out.print("Answer:  ");
            String answer = scanner.next();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswerCount++;

            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
