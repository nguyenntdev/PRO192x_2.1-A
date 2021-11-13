import java.util.ArrayList;

public class lab073 {
    public static void doubleList(ArrayList<String> array) {
        int oldSize = array.size();

        for (int i = 0; i < oldSize; i++) {
            String word = array.get(2 * i);
            array.add(2 * i + 1, word);
        }

    }
}
