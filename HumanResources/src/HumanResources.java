import java.util.Scanner;


public class HumanResources {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static int featureMenu() {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==========================================================================\n" +
                               "Human Resources - Assignment 2 - Nguyen Ngoc Thien\n" +
                               "\n" +
                               "Xin vui long chon chuc nang muon thuc hien [1 - 7]\n" +
                               "\t1. Hien thi danh sach nhan vien \n" +
                               "\t2. Hien thi cac bo phan \n" +
                               "\t3. Hien thi cac nhan vien theo tung bo phan\n" +
                               "\t4. Them nhan vien moi vao cong ty\n" +
                               "\t5. Tim kiem thong tin nhan vien\n" +
                               "\t6. Hien thi bang luong cua nhan vien trong cong ty\n" +
                               "\t7. Hien thi bang luong cua nhan vien theo thu tu tang dan\n" +
                               "\t8. Thoat\n" +
                               "==========================================================================");

            choice = input.nextInt();
            if (!(choice > 0 && choice < 9)) {
                clearScreen();

                System.out.println("\n\nLua chon ban nhap khong hop le, xin vui long nhap lai!");
            }
        } while (!(choice > 0 && choice < 9));
        return choice;
    }

    public static void showEmployeeList() {

    }


    public static void main(String[] args) {
        int choice = featureMenu();
        switch (choice) {
            case 1:
                break;

            default:
                break;
        }


    }
}
