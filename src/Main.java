import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int[] input = {4, 3, 1, 1, 3, 5, 5, 8, 8, 8, 9};
        List<Integer> result = practic.printArray(input);
        System.out.println(result);
    }
}