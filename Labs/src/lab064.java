public class lab064 {
    public static boolean isSorted(double[] array) {
        double pre = array[0];

        for (int i = 1; i < array.length; i++) {
            double current = array[i];
            if (pre >= current) {
                return false;
            }
            pre = current;
        }

        return true;
    }
}
