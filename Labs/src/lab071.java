import java.util.ArrayList;

public class lab071 {
    public static void swapPairs(ArrayList<String> array) {
        for (int i = 0; i < array.size() / 2; i++) {
            String temp = array.get(2 * i + 1);
            array.set(2 * i + 1, array.get(2 * i));
            array.set(2 * i, temp);
        }

    }
}
