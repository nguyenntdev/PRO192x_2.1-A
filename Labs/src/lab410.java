public class lab410 {
    public static void main(String[] args) {
        for(int k = 1; k<= 6; k++) {
            for(int i = 1; i <= 9; i++)
                System.out.print(" ");
            System.out.print("|");
        }
        System.out.println();
        for(int j = 1; j <= 60; j++)
            System.out.print(j%10);
    }
}
