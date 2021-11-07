public class Employee extends Staff {
    private int overtimeHours;
    private double Salary;


    public double calculateSalary(double coefficientSalary, int overtimeHours) {
        Salary = (coefficientSalary * 3000000) + (overtimeHours * 200000);
        return Salary;
    }

    Employee(String id2, String name2, String department2, String entryDate2, int age2, int vacationDate2, double coefficientSalary2) {
        id = id2;
        name = name2;
        department = department2;
        entryDate = entryDate2;
        age = age2;
        vacationDate = vacationDate2;
        coefficientSalary = coefficientSalary2;
    }

    @Override
    void displayInformation() {
        System.out.println("Ten nhan vien: " + this.name);
        System.out.println("Tuoi nhan vien: " + this.age);
        System.out.println("Ma nhan vien: " + this.id);
        System.out.println("Bo phan lam viec: " + this.department);
        System.out.println("Ngay vao lam viec [dd/mm/yyyy]: " + this.entryDate);
        System.out.println("So ngay nghi: " + this.vacationDate);
    }
}
