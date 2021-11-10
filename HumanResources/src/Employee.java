/**
 * - File Employee.java: là nơi chứa các hàm xly dữ liệu của nhân viên,
 * class Employee thừa kế từ class Staff và interface ICalculator.
 * Trong này chúng ta sẽ khai báo thêm 1 biến riêng của nhân viên là
 * overtimeHours, nghĩa là giờ làm thêm. Sau đó trong này
 * gồm constructor để lấy input, hàm calculateSalary return lương,
 * và in thông tin nhân viên.
 */
public class Employee extends Staff implements ICalculator {
    /**
     * - Khởi tạo biến overtimeHours cần thiết của Employee
     * mà Staff không có.
     */


    private final int overtimeHours;

    /**
     * - Constructor Employee(): lấy DL của người dùng
     * trong đó các DL cần lấy là ID, tên, bộ phận,
     * ngày vào làm, tên, tuổi, ngày nghỉ, HSL.
     */

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

    /**
     * - Hàm calculateSalary(), return kết quả dạng double.
     * Return về kết quả công thức lương: HSL * 3000000
     * + số giờ làm thêm * 200000
     */
    public double calculateSalary() {
        return (coefficientSalary * 3000000) + (overtimeHours * 200000);
    }

    /**
     * - Hàm displayInfomation(): in thông tin quản lý
     * như tên, tuổi, chức vụ, lương...v.v.
     */

    @Override
    void displayInformation() {
        System.out.printf("| %-10s | %-10d | %-10s | %-10s | %-10s   | %-10d   | %-10.1f | %-10d   | %-16s |\n", this.name,
                this.age, this.id, this.department, this.entryDate, this.vacationDate, this.calculateSalary(), this.overtimeHours, " ");
    }


}
