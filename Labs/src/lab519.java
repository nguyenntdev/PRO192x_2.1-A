public class lab519 {
    public static void printReverse(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
