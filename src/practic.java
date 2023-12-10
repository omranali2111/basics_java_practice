import java.util.ArrayList;
import java.util.List;

public class practic {

    public static List<Integer> printArray(int[] array) {
        List<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (!result.contains(array[i])) {
                result.add(array[i]);
            }
        }

        return result;
    }
}
