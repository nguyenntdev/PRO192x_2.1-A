public class lab062 {
    public static int range(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }

        return max - min + 1;
    }
}
