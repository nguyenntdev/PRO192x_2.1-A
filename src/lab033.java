import java.util.Scanner;
public class lab033 {
    public static void smallestLargest() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int number = console.nextInt();
        System.out.print("Number 1: ");
        int firstNum = console.nextInt();
        int min = firstNum;
        int max = firstNum;

        for (int i = 2; i <= number; i++) {
            System.out.print("Number " + i + ": ");
            int num = console.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        System.out.printf("Smallest = %d\n", min);
        System.out.printf("Largest = %d\n", max);
    }
    public static void main(String[] args) {
        smallestLargest();
    }
}
