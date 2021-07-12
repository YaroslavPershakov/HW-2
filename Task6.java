public class Task6 {

    public static boolean isSimple(int x) {
        if (x < 2) {
            return false;

        } else if (x == 2){
            return true;

        } else {
            for(int i = 2; i*i <= x; i++) {

                if (x % i == 0) {
                    return false;
                }

            }

            return true;

        }
    }

    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++) {

            if (isSimple(i)) {
                System.out.println(i);

            }
        }
    }
}
