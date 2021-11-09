/*
  Assignment 2 - HumanResources - Nguyễn Ngọc Thiện - FX10909
  - Là phần mềm quản lý nhân sự trong công ty, gồm 7 chức
    năng chính:
    1. Hiển thị danh sách nhân viên hiện có trong công ty
    (Hàm showEmployee())
    2. Hiển thị các bộ phận trong công ty
    (Hàm showDepartment())
    3. Hiển thị các nhân viên theo từng bộ phận
    (Hàm showDepartmentEmployee())
    4. Thêm nhân viên mới vào công ty (Hàm addNewPerson): bao gồm 2 loại
       - Thêm nhân viên thông thường (Hàm addEmployee())
       - Thêm nhân viên là cấp quản lý (có thêm chức vụ) (Hàm addManager())
    5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
       (Hàm findEmployee())
    6. Hiển thị bảng lương của nhân viên toàn công ty
       (Hàm showDecreaseSalary())
    7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
       (Hàm showIncreaseSalary())

  - Cấu trúc dự án gồm 6 file chính:
    1. Department.java
    2. Employee.java
    3. ICalculator.java
    4. Manager.java
    5. Staff.java
    6. HumanResources.java
  */

import java.util.*;

public class HumanResources {

    public static final Scanner input = new Scanner(System.in).useLocale(Locale.US);
    public static final ArrayList<Staff> staffArr = new ArrayList<>();
    public static final ArrayList<Department> departmentArr = new ArrayList<>();

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static int featureMenu() {

        int choice;

        do {
            System.out.println("""
                    ==========================================================================
                    Human Resources - Assignment 2 - Nguyen Ngoc Thien

                    Xin vui long chon chuc nang muon thuc hien [1 - 7]
                    \t1. Hien thi danh sach nhan vien\s
                    \t2. Hien thi cac bo phan\s
                    \t3. Hien thi cac nhan vien theo tung bo phan
                    \t4. Them nhan vien moi vao cong ty
                    \t5. Tim kiem thong tin nhan vien
                    \t6. Hien thi bang luong cua nhan vien trong cong ty
                    \t7. Hien thi bang luong cua nhan vien theo thu tu tang dan
                    \t8. Thoat
                    ==========================================================================""");

            choice = input.nextInt();
            if (!(choice > 0 && choice < 9)) {
                clearScreen();

                System.out.println("\n\nLua chon ban nhap khong hop le, xin vui long nhap lai!");
            }
        } while (!(choice > 0 && choice < 9));
        return choice;
    }

    public static void showEmployee() {
        for (Staff staff : staffArr) {
            staff.displayInformation();
            System.out.println("\n");
        }
    }

    public static void showDecreaseSalary() {
        staffArr.sort((staff1, staff2) -> (int) (((ICalculator) staff2).calculateSalary() - ((ICalculator) staff1).calculateSalary()));

        for (Staff staff : staffArr) {
            staff.displayInformation();
            System.out.println("\n");
        }
    }

    public static void showIncreaseSalary() {
        staffArr.sort((staff1, staff2) -> (int) (((ICalculator) staff1).calculateSalary() - ((ICalculator) staff2).calculateSalary()));

        for (Staff staff : staffArr) {
            staff.displayInformation();
            System.out.println("\n");
        }
    }

    public static void showDepartmentEmployee() {
        for (Department department : departmentArr) {

            System.out.println(department.getDepartmentName());

            for (Staff staff : staffArr) {
                if (department.getDepartmentName().equals(staff.department)) {
                    System.out.println("\n");
                    staff.displayInformation();
                }
            }
        }
    }

    public static void showDepartment() {
        for (Department department : departmentArr) {
            System.out.println(department.getDepartmentName());
        }
    }

    public static void addManager() {
        String id, name, department = "", entryDate;
        int age, vacationDate, departmentID = 0, overtimeHours;

        Department departmentObj = new Department(department, departmentID);
        double coefficientSalary;

        System.out.println("Xin vui long nhap thong tin quan ly moi: ");
        System.out.print("Ten quan ly: ");
        name = input.next();
        System.out.print("Tuoi quan ly: ");
        age = input.nextInt();
        System.out.print("Ma quan ly: ");
        id = input.next();
        System.out.print("""

                Chuc danh cua quan ly:
                \t1. Business leader
                \t2. Project leader
                \t3. Technical leader""");
        int position = input.nextInt();
        System.out.print("Bo phan lam viec: ");
        department = input.next();
        boolean checkDepartmentIncrease = false;
        for (Department value : departmentArr) {
            if (value.getDepartmentName().equals(department)) {
                value.increaseEmployeesNumber();
                checkDepartmentIncrease = true;
            }
        }

        if (!checkDepartmentIncrease) {
            System.out.print("Xin vui long nhap ma bo phan: ");
            departmentID = input.nextInt();
            departmentObj = new Department(department, departmentID);
        }

        System.out.print("Xin vui long nhap he so luong: ");
        coefficientSalary = input.nextDouble();

        System.out.print("Ngay vao lam viec [dd/mm/yyyy]: ");
        entryDate = input.next();
        System.out.print("So ngay nghi: ");
        vacationDate = input.nextInt();

        Manager manager = new Manager(id, name, department, entryDate, age, vacationDate, coefficientSalary, position);

        staffArr.add(manager);
        departmentArr.add(departmentObj);
    }

    public static void addEmployee() {
        String id, name, department = "", entryDate;
        int age, vacationDate, departmentID = 0, overtimeHours;

        Department departmentObj = new Department(department, departmentID);
        double coefficientSalary;

        System.out.println("Xin vui long nhap thong tin nhan vien moi: ");
        System.out.print("Ten nhan vien: ");
        name = input.next();
        System.out.print("Tuoi nhan vien: ");
        age = input.nextInt();
        System.out.print("Ma nhan vien: ");
        id = input.next();
        System.out.print("Bo phan lam viec: ");
        department = input.next();
        boolean checkDepartmentIncrease = false;
        for (Department value : departmentArr) {
            if (value.getDepartmentName().equals(department)) {
                value.increaseEmployeesNumber();
                checkDepartmentIncrease = true;
            }
        }

        if (!checkDepartmentIncrease) {
            System.out.print("Xin vui long nhap ma bo phan: ");
            departmentID = input.nextInt();
            departmentObj = new Department(department, departmentID);
        }

        System.out.print("Xin vui long nhap he so luong: ");
        coefficientSalary = input.nextDouble();

        System.out.print("Xin vui long nhap so gio lam them: ");
        overtimeHours = input.nextInt();


        System.out.print("Ngay vao lam viec [dd/mm/yyyy]: ");
        entryDate = input.next();
        System.out.print("So ngay nghi: ");
        vacationDate = input.nextInt();

        Employee employee = new Employee(id, name, department, entryDate, age, vacationDate, coefficientSalary, overtimeHours);

        staffArr.add(employee);
        departmentArr.add(departmentObj);

    }

    public static void addNewPerson() {
        int choice;
        do {
            System.out.println("""
                    Xin vui long chon loai nhan vien:
                    \t1. Nhan vien thong thuong
                    \t2. Nhan vien cap quan ly""");
            choice = input.nextInt();
            if (!(choice == 1) && !(choice == 2)) {
                System.out.println("Lua chon ban nhap khong hop le, xin vui long nhap lai\n");
            } else if (choice == 1) {
                addEmployee();
            } else {
                addManager();
            }

        } while (!(choice == 1) && !(choice == 2));
    }

    public static void findEmployee() {
        System.out.println("Ban muon tim nhan vien theo ID hay ten?\n ID: 1\n Ten: 2");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 2 -> {
                System.out.print("Xin vui long nhap ten nhan vien: ");
                String staffName = input.nextLine();

                for (Staff staff : staffArr) {
                    if (staffName.equals(staff.name)) {
                        staff.displayInformation();
                    }
                }
            }

            case 1 -> {
                System.out.print("Xin vui long nhap ID nhan vien: ");
                String staffID = input.nextLine();

                for (Staff staff : staffArr) {
                    if (staffID.equals(staff.id)) {
                        staff.displayInformation();
                    }
                }
            }

        }
    }


    public static void main(String[] args) {
        int choice;
        do {
            choice = featureMenu();
            switch (choice) {
                case 1 -> showEmployee();
                case 2 -> showDepartment();
                case 3 -> showDepartmentEmployee();
                case 4 -> addNewPerson();
                case 5 -> findEmployee();
                case 6 -> showDecreaseSalary();
                case 7 -> showIncreaseSalary();
                case 8 -> {
                }
                default -> System.out.println("Lua chon ban nhap khong hop le, xin vui long nhap lai!");
            }
        } while (choice != 8);
    }
}
