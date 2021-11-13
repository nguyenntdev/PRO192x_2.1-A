public class lab067 {
    public static int kthLargest(int k, int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    int temp = min;
                    array[i] = array[j];
                    array[j] = temp;
                    min = array[i];
                }
            }
        }

        return array[array.length - 1 - k];
    }
}
