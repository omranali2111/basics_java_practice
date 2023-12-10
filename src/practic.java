import java.util.ArrayList;
import java.util.List;

public class practic {

    public static List<Integer> printArray(int[] array) {
        List<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for (int i = 1; i < array.length; i++) {

            if(array[i]!=array[i-1]){
                result.add(array[i]);
            }

        }
        return result;
    }
}
