public class Department {
    private String departmentID, departmentName;
    private int departmentEmployeesNumber;

    Department(String i) {
        departmentName = i;
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

}
