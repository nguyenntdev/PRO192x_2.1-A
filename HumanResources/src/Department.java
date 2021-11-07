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
