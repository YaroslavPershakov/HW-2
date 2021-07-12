import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int num = 24212423;
        int num1 = num;
        int c = 1;
        boolean pal = true;

        while (num1 / 10 > 0) {
            c += 1;
            num1 /= 10;
        }

        int[] number = new int[c];

        int i = 0;
        while (i < c) {
            number[number.length - i - 1] = num % 10;
            num /= 10;
            i += 1;
        }

        for (int k = 0; k < number.length / 2; k++) {
            if (number[k] != number[number.length - 1 - k]) {
                pal = false;
                break;
            }
        }

        if (pal) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
