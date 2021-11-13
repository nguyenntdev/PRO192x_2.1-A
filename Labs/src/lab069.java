public class lab069 {
    public static int minGap(int[] array) {
        if (array.length < 2) {
            return 0;
        } else {
            int min = array[1] - array[0];

            for (int i = 1; i < array.length - 1; i++) {
                int difference = array[i + 1] - array[i];
                if (difference < min) {
                    min = difference;
                }
            }

            return min;
        }
    }
}
