/** - File Department.java: gồm class Department, khai báo
 *    các biến là tên bộ phận, số người trong bộ phận và
 *    mã bộ phận. Gồm 4 hàm: constructor lấy input,
 *    toString() in thông tin, getDepartmentName lấy tên
 *    bộ phận để so sánh, còn increaseEmployeesNumber dùng
 *    để tăng số người trong bộ phận.
 * */
public class Department {
    private final String departmentName;
    private int departmentEmployeesNumber;
    private final int departmentID;

    public Department(String i, int n) {
        departmentName = i;
        departmentID = n;
    }



    public String toString() {
        System.out.println("Ten bo phan: " +
                departmentName +
                "\nMa bo phan: " +
                departmentID +
                "\nSo nhan vien: " +
                departmentEmployeesNumber
                );
        return null;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void increaseEmployeesNumber() {
        departmentEmployeesNumber++;
    }

}
