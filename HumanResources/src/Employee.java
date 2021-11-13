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
     * - Constructor Employee(): tạo Employee với
     * các thông tin DL truyền vào, gồm ID, tên,
     * bộ phận, ngày vào làm, tên, tuổi, ngày nghỉ, HSL.
     */

    public Employee(String id, String name, String department, String entryDate, int age, int vacationDate, double coefficientSalary, int overtimeHours) {
        super(id, name, department, entryDate, age, vacationDate, coefficientSalary);
        this.overtimeHours = overtimeHours;
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
    public void displayInformation() {
        System.out.printf("| %-10s | %-10d | %-10s | %-10s | %-10s   | %-10d   | %-10.1f | %-10d   | %-16s |\n", this.name,
                this.age, this.id, this.department, this.entryDate, this.vacationDate, this.calculateSalary(), this.overtimeHours, " ");
    }


}
