public class lab068 {

    public static int median(int[] array) {
        int[] spareArray = new int[100];

        for (int i = 0; i < array.length; i++) {
            spareArray[array[i]]++;
        }
        int sum = 0;
        int median = -1;

        for (int i = 0; i < spareArray.length; i++) {
            sum += spareArray[i];
            if (sum == array.length / 2 + 1) {
                return i;
            }
        }

        return -1;
    }
}
