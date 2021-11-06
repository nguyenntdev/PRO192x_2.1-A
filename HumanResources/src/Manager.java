public class Manager extends Staff {
    private String position;


    @Override
    void displayInformation() {
        System.out.println("Ten quan ly: " + this.name);
        System.out.println("Chuc danh: " + this.position);
        System.out.println("Tuoi quan ly: " + this.age);
        System.out.println("Ma quan ly: " + this.id);
        System.out.println("Bo phan lam viec: " + this.department);
        System.out.println("Ngay vao lam viec: " + this.entryDate);
        System.out.println("So ngay nghi: " + this.vacationDate);
    }
}
