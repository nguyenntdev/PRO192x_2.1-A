public class lab517 {
    public static String padString(String string, int length) {
        int wordLength = string.length();

        for (int space = 1; space <= length - wordLength; space++) {
            string = " " + string;
        }

        return string;
    }
}
