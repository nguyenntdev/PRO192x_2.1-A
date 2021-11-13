public class lab063 {
    public static int countInRange(int[] array, int min, int max) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num >= min && num <= max) {
                count++;
            }
        }

        return count;
    }
}
