import java.util.Scanner;
public class lab036 {
    public static void printTriangleType(int a, int b, int c) {

        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = input.nextInt();
        System.out.print("Please enter b: ");
        int b = input.nextInt();
        System.out.print("Please enter c: ");
        int c = input.nextInt();

        printTriangleType(a, b, c);
    }
}
