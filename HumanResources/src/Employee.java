public class Employee extends Staff {
    private int overtimeHours;
    private double Salary;

    public double calculateSalary(double coefficientSalary, int overtimeHours) {
        Salary = (coefficientSalary * 3000000) + (overtimeHours * 200000);
        return Salary;
    }

    @Override
    void displayInformation() {
        System.out.println("Ten nhan vien: " + name);
        System.out.println("Tuoi nhan vien: " + age);
        System.out.println("Ma nhan vien: " + id);
    }
}
