public class lab513 {
    public static double pay(double hourSalary, int hour) {
        double salary = 0;
        if (hour > 8) {
            salary = 8 * hourSalary + (hour - 8) * (1.5 * hourSalary);
        } else {
            salary = hour * hourSalary;
        }
        return salary;
    }
}
