public class lab061 {

    public static int lastIndexOf(int[] array, int value) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
