/**
 * - File Department.java: gồm class Department, khai báo
 *    các biến là tên bộ phận, số người trong bộ phận và
 *    mã bộ phận. Gồm 4 hàm: constructor lấy input,
 *    toString() in thông tin, getDepartmentName lấy tên
 *    bộ phận để so sánh, còn increaseEmployeesNumber dùng
 *    để tăng số người trong bộ phận.
 */
public class Department {

    /**
     * - 3 dòng dưới đây khởi tạo các biến cần thiết cho
     *   Department như tên bộ phận (departmentName), số
     *   người trong bộ phận (departmentEmployeesNumber),
     *   ID bộ phận (departmentID)
     */

    private final String departmentName;
    private int departmentEmployeesNumber, departmentID;

    /**
     * - Constructor Department(): lấy input của người dùng
     *   tên và ID bộ phận
     */

    public Department(String i, int n, int z) {
        departmentName = i;
        departmentID = n;
        departmentEmployeesNumber = z;
    }


    /**
     * - Hàm toString(): In thông tin bộ phận: tên, mã, số
     *   nhân viên
     */
    public String toString() {
        return ("Ten bo phan: " +
                departmentName +
                "\nMa bo phan: " +
                departmentID +
                "\nSo nhan vien: " +
                departmentEmployeesNumber);
    }

    /**
     * - Hàm getDepartmentName(): trả về tên bộ phận
     * */

    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * - Hàm increaseEmployeesNumber(): tăng số nhân viên
     *   trong bộ phận
     * */

    public void increaseEmployeesNumber() {
        departmentEmployeesNumber++;
    }

}
