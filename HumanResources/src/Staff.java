/**
 * - Class abstract Staff, gồm các biến chung của
 * 2 loại nhân viên: id, tên, bộ phận, ngày vào
 * làm, tuổi, số ngày nghỉ, hệ số lương và hàm
 * chung là in thông tin nhân viên
 */

abstract class Staff {
    private String id, name, department, entryDate;
    private int age, vacationDate;
    private double coefficientSalary;

    abstract void displayInformation();

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public String entryDate() {
        return entryDate;
    }

    public int age() {
        return age;
    }

    public int vacationDate() {
        return vacationDate;
    }

    public double coefficientSalary() {
        return coefficientSalary;
    }
}
