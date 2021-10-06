import java.util.Scanner;
public class lab031 {
    public static void season(int month) {

        if (month >= 1 && month <= 3) {
            System.out.println("Spring");
        }

        if (month > 3 && month <= 6) {
            System.out.println("Summer");
        }

        if (month > 6  && month <= 9) {
            System.out.println("Autumn");
        }

        if (month > 9) {
            System.out.println("Winter");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month [1 - 12]: ");
        int month = input.nextInt();
        while (month > 12) {
            System.out.println("Invalid month. Try again.\n");
            System.out.print("Please enter month [1 - 12]: ");
            month = input.nextInt();
        }
        season(month);
    }

}
