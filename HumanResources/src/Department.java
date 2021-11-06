public class Department {
    private String departmentID, departmentName;
    private int departmentEmployeesNumber;

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
