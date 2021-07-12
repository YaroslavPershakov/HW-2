import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0; int f2 = 1;

        System.out.print(f1 + ", " + f2);

        for(int i = 3; i <= n; i++) {

            int fn = f1+f2;
            f1 = f2;
            f2 = fn;
            System.out.print(", " + fn);

        }
    }
}
