import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива:");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (10 + Math.random() * 90);
        }

        System.out.println("""
                1. Вывести массив\s
                2. Увеличить элемент массива на 10%
                3. Выход""");

        int menu = scanner.nextInt();

        switch (menu){
            case 1:
                System.out.println(Arrays.toString(arr));
                break;

            case 2:
                System.out.println("Всего элементов в массиве: " + (n - 1));
                System.out.println("Какой элемент массива увеличить?");

                int elem = scanner.nextInt();
                float inc = arr[elem] * 0.1f;

                System.out.println(elem + " элемент массива = " + arr[elem]);

                arr[elem] = arr[elem] + (int)inc;

                System.out.println("Увеличенный на 10% ~ " + arr[elem]);
                break;

            case 3:
                break;

            default:
                System.out.println("Ошибка: нет такого пункта меню!");
                break;
        }
    }
}

