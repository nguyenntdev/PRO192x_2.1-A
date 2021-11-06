public class Employee extends Staff {
    private int overtimeHours;
    private double Salary;

    public double calculateSalary(double coefficientSalary, int overtimeHours) {
        Salary = (coefficientSalary * 3000000) + (overtimeHours * 200000);
        return Salary;
    }

    @Override
    void displayInformation() {
        System.out.println("Ten nhan vien: " + this.name);
        System.out.println("Tuoi nhan vien: " + this.age);
        System.out.println("Ma nhan vien: " + this.id);
        System.out.println("Bo phan lam viec: " + this.department);
        System.out.println("Ngay vao lam viec: " + this.entryDate);
        System.out.println("So ngay nghi: " + this.vacationDate);
    }
}
