/**
 * - Class abstract Staff, gồm các biến chung của
 * 2 loại nhân viên: id, tên, bộ phận, ngày vào
 * làm, tuổi, số ngày nghỉ, hệ số lương và hàm
 * chung là in thông tin nhân viên, sau đó tạo
 * các getter-setter và constructor cho các biến ấy.
 */

abstract class Staff {
    protected String id, name, department, entryDate;
    protected int age, vacationDate;
    protected double coefficientSalary;

    abstract void displayInformation();


    // Getter và setter của các tên, tuổi, bộ phận, HSL, ngày vào làm, ngày nghỉ

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVacationDate() {
        return vacationDate;
    }

    public void setVacationDate(int vacationDate) {
        this.vacationDate = vacationDate;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    /**
     * Constructor Staff():  hàm constructor của Staff với
     * các thuộc tính đầu vào gồm id, tên, bộ phận, ngày
     * vào làm, tuổi, ngày nghỉ, HSL
     * */

    public Staff(String id, String name, String department, String entryDate, int age, int vacationDate, double coefficientSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.entryDate = entryDate;
        this.age = age;
        this.vacationDate = vacationDate;
        this.coefficientSalary = coefficientSalary;
    }
}
