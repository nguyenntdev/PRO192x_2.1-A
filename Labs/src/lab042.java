public class lab042 {
    public static void main(String[] args) {
        int num = 0;
        int p = 1;
        for (int i = 1; i <= 10; i++) {
            num += p;
            p += 2;
            System.out.print(num + " ");
        }
    }
}
