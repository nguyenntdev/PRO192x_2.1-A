/**
 * - File Employee.java: là nơi chứa các hàm xly dữ liệu của nhân viên,
 *   class Employee thừa kế từ class Staff và interface ICalculator.
 *   Trong này chúng ta sẽ khai báo thêm 1 biến riêng của nhân viên là
 *   overtimeHours, nghĩa là giờ làm thêm. Sau đó trong này
 *   gồm constructor để lấy input, hàm calculateSalary return lương,
 *   và in thông tin nhân viên.
 */
public class Employee extends Staff implements ICalculator {
    private final int overtimeHours;

    public double calculateSalary() {
        return (coefficientSalary * 3000000) + (overtimeHours * 200000);
    }

    Employee(String id2, String name2, String department2, String entryDate2, int age2, int vacationDate2, double coefficientSalary2, int overtimeHours2) {
        id = id2;
        name = name2;
        department = department2;
        entryDate = entryDate2;
        age = age2;
        vacationDate = vacationDate2;
        coefficientSalary = coefficientSalary2;
        overtimeHours = overtimeHours2;
    }

    @Override
    void displayInformation() {
        System.out.println("Ten nhan vien: " + this.name);
        System.out.println("Tuoi nhan vien: " + this.age);
        System.out.println("Ma nhan vien: " + this.id);
        System.out.println("Bo phan lam viec: " + this.department);
        System.out.println("Ngay vao lam viec [dd/mm/yyyy]: " + this.entryDate);
        System.out.println("So ngay nghi: " + this.vacationDate);
        System.out.println(String.format("Luong: %.1f", calculateSalary()));
    }


}
