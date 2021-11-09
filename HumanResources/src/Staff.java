/** - Class abstract Staff, gồm các biến chung của
 *    2 loại nhân viên: id, tên, bộ phận, ngày vào
 *    làm, tuổi, số ngày nghỉ, hệ số lương và hàm
 *    chung là in thông tin nhân viên
 * */
abstract class Staff {
    public String id = "", name = "", department = "", entryDate = "";
    public int age = 0, vacationDate = 0;
    public double coefficientSalary = 0;

    abstract void displayInformation();
}
