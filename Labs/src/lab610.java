public class lab610 {

    public static double percentEven(int[] array) {
        if (array.length == 0) {
            return 0.0;
        } else {
            double evenNum = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenNum++;
                }
            }

            return evenNum * 100 / array.length;
        }
    }
}
