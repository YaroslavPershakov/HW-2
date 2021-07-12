import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randChar = (int) (Math.random() * 25) + 97;
        char guessChar = (char) randChar;

        System.out.println(guessChar);

        while (true) {
            char inputCh = scanner.next().charAt(0);

            if (inputCh == guessChar) {
                System.out.println("Right!");
                break;

            } else if ((int) inputCh < guessChar) {
                System.out.println("You`re too low");

            } else if ((int) inputCh > guessChar) {
                System.out.println("You`re too high");

            }
        }
    }
}
