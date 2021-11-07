// Import class ngoài, tạo mảng
import java.util.*;


public class HumanResources {

    public static String id = "", name = "", department = "", entryDate = "";
    public static int age = 0, vacationDate = 0;
    public static double coefficientSalary = 0;

    public static int arrNumbers = 0;
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Staff> staffArr = new ArrayList<Staff>();
    public static ArrayList<String> departmentArr = new ArrayList<String>();


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

    public static void showEmployee() {
        for (int i = 0; i < staffArr.size(); i++) {
            staffArr.get(i).displayInformation();
            System.out.println("\n");
        }

    }

    public static void showDepartmentEmployee() {
        for (int i = 0; i < departmentArr.size(); i++) {
            departmentArr.get(i);
            for (int j = 0; j < staffArr.size(); j++) {
                if(departmentArr.get(i).equals(staffArr.get(j))) {
                    staffArr.get(j).displayInformation();
                }
            }
        }
    }

    public static void showDepartment() {
        Collections.sort(departmentArr);
        System.out.println(departmentArr.get(0).toString());
        for (int i = 0; i < departmentArr.size(); i++) {
            if (i == 0) {
                System.out.println(departmentArr.get(0));
            }
            if (!(departmentArr.get(i).equals(departmentArr.get(i-1))) && i > 0) {
                System.out.println(departmentArr.get(i).toString());
            }
        }
    }

    public static void addEmployee() {

        System.out.println("Xin vui long nhap thong  tin nhan vien moi: ");
        System.out.print("Ten nhan vien: ");
        name = input.next();
        System.out.print("Tuoi nhan vien: ");
        age = input.nextInt();
        System.out.print("Ma nhan vien: ");
        id = input.next();
        System.out.print("Bo phan lam viec: ");
        department = input.next();
        System.out.print("Ngay vao lam viec [dd/mm/yyyy]: ");
        entryDate = input.next();
        System.out.print("So ngay nghi: ");
        vacationDate = input.nextInt();

        Employee employee = new Employee(id, name, department, entryDate, age, vacationDate, coefficientSalary);

        staffArr.add(employee);
        departmentArr.add(department);

    }


    public static void main(String[] args) {
        int choice;
        do {
            choice = featureMenu();
            switch (choice) {
                case 1 -> showEmployee();
                case 2 -> showDepartment();
                case 3 -> showDepartmentEmployee();
                case 4 -> addEmployee();
                default -> {
                }
            }
        }while(choice != 8);
    }
}
