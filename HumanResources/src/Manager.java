/**
 * - File Manager.java: là nơi chứa các hàm xly dữ liệu của quản lý,
 *   class Manager thừa kế từ class Staff và interface ICalculator.
 *   Trong này chúng ta sẽ khai báo thêm 3 biến riêng của manager là
 *   chức vụ (choice dạng số) và chức vụ dạng chữ. Sau đó trong này
 *   gồm constructor để lấy input, hàm calculateSalary return lương,
 *   và in thông tin quản lý.
 */


public class Manager extends Staff implements ICalculator {
    /**
     * - Khởi tạo biến cần thiết của Manager
     *    mà Staff không có, trong đó có chức vụ (position)
     *    ở dạng int (lấy input dạng số), chức vụ dạng chữ
     *    (positionString) ở dạng String và lương trách nhiệm
     *    (responsibilitySalary) ở dạng double.
     * */

    private final int position;
    private String positionString;
    private double responsibilitySalary;



    /**
     * - Hàm calculateSalary(), return kết quả dạng double.
     * Đầu tiên dùng switch case để xem thử chức vụ là gì
     * => lương trách nhiệm là bao nhiêu. Sau đó return về
     * kết quả công thức HSL * 5000000 + lương trách nhiệm.
     */

    public double calculateSalary() {
        switch (position) {
            case 1 -> responsibilitySalary = 8000000;
            case 2 -> responsibilitySalary = 5000000;
            case 3 -> responsibilitySalary = 6000000;
        }
        return coefficientSalary * 5000000 + responsibilitySalary;
    }


    /**
     *  - Constructor Manager(): lấy DL của người dùng
     *    trong đó các DL cần lấy là ID, tên, bộ phận,
     *    ngày vào làm, tên, tuổi, ngày nghỉ, HSL, chức
     *    vụ
     * */

    Manager(String id2, String name2, String department2, String entryDate2, int age2, int vacationDate2, double coefficientSalary2, int position2) {
        id = id2;
        name = name2;
        department = department2;
        entryDate = entryDate2;
        age = age2;
        vacationDate = vacationDate2;
        coefficientSalary = coefficientSalary2;
        position = position2;
    }

    /**
     * - Hàm displayInfomation(): in thông tin quản lý
     *    như tên, tuổi, chức vụ, lương...v.v.
     * */

    @Override
    void displayInformation() {
        switch (position) {
            case 1 -> positionString = "Business leader";
            case 2 -> positionString = "Project leader";
            case 3 -> positionString = "Technical leader";
        }
        System.out.printf("| %-10s | %-10d | %-10s | %-10s | %-10s   | %-10d   | %-10.1f | %-10s   | %-16s |\n" +
                        "", this.name,
                this.age, this.id, this.department, this.entryDate, this.vacationDate, this.calculateSalary(), " ", this.positionString);

    }
}
