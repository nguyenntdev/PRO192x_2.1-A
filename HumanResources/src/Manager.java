public class Manager extends Staff {
    private int position;
    private int overtimeHours;

    void calculateSalary() {

    }


    Manager(String id2, String name2, String department2, String entryDate2, int age2, int vacationDate2, double coefficientSalary2, int overtimeHours2, int position2) {
        id = id2;
        name = name2;
        department = department2;
        entryDate = entryDate2;
        age = age2;
        vacationDate = vacationDate2;
        coefficientSalary = coefficientSalary2;
        overtimeHours = overtimeHours2;
        position = position2;
    }

    @Override
    void displayInformation() {
        System.out.println("Ten quan ly: " + this.name);
        System.out.println("Chuc danh: " + this.position);
        System.out.println("Tuoi quan ly: " + this.age);
        System.out.println("Ma quan ly: " + this.id);
        System.out.println("Bo phan lam viec: " + this.department);
        System.out.println("Ngay vao lam viec [dd/mm/yyyy]: " + this.entryDate);
        System.out.println("So ngay nghi: " + this.vacationDate);
    }
}
