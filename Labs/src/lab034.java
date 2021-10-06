import java.util.Scanner;
public class lab034 {
    public static void evenSum() {
        Scanner console = new Scanner(System.in);
        System.out.print("how many integers? ");
        int numInt = console.nextInt();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < numInt; i++) {
            System.out.print("next integer? ");
            int integer = console.nextInt();
            if (integer % 2 == 0) {
                sum += integer;
                if (integer > max) {
                    max = integer;
                }
            }
        }

        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
    public static void main(String[] args) {
        evenSum();
    }
}
