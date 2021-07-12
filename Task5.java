import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int n1 = n;
        int c = 1;
        int sum = 0;

        while (n1 / 10 > 0) {
            c += 1;
            n1 /= 10;
        }

        int[] num = new int[c];

        int i = 0;

        while (i < c) {
            num[num.length - i - 1] = n % 10;
            n /= 10;
            i += 1;
        }


        for (i = 0; i < num.length - 2; i++) {
                sum += num[i] + num[i+1];
            }

        System.out.println(sum);
    }
}