public class lab049 {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        for(int j = 1; j <= 10; j++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for(int j = 0; j < 2; j++) {
            for(int i = 1; i <= 10; i++) {
                System.out.print(i%10);
                System.out.print(i%10);
            }
        }
        System.out.println();
        for(int i = 1; i <= 40; i++)
            System.out.print("-");
    }
}
