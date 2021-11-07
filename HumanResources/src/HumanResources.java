// Import class ngoài, tạo mảng
import java.util.*;


public class HumanResources {

    public static int arrNumbers = 0;
    public static Scanner input = new Scanner(System.in);

//    public static ArrayList<Employee> employee = new ArrayList<Employee>(); // generic - kiểu mới

    public static Employee[] employee = new Employee[] {};

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static int featureMenu() {

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

    public static void addEmployee() {

        System.out.println("Xin vui long nhap thong tin nhan vien moi: ");
        System.out.print("Ten nhan vien: ");
        employee[arrNumbers].name = input.nextLine();
        System.out.println("Tuoi nhan vien: ");
        employee[arrNumbers].age = input.nextInt();
        System.out.println("Ma nhan vien: ");
        employee[arrNumbers].id = input.nextLine();
        System.out.println("Bo phan lam viec: ");
        employee[arrNumbers].department = input.nextLine();
        System.out.println("Ngay vao lam viec [dd/mm/yyyy]: ");
        employee[arrNumbers].entryDate = input.nextLine();
        System.out.println("So ngay nghi: ");
        employee[arrNumbers].vacationDate = input.nextInt();

        arrNumbers++;
    }


    public static void main(String[] args) {
        int choice;
        do {
            choice = featureMenu();
            switch (choice) {
                case 4:
                    addEmployee();
                    break;

                default:
                    break;
            }
        }while(choice != 8);
    }
}
