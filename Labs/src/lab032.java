import java.util.Scanner;
public class lab032 {
    public static int daysInMonth(int month) {
        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    public static void main(String[] args) {

        int day = 0;
        int month = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month [1 - 12]: ");
        month = input.nextInt();
        while (month > 12) {
            System.out.println("Invalid month. Try again.\n");
            System.out.print("Please enter month [1 - 12]: ");
            month = input.nextInt();
        }

        System.out.println(daysInMonth(month));

    }
}
