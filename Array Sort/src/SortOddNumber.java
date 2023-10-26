import java.util.*;

public class SortOddNumber {
    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        Collections.sort(oddNumbers);

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                int min = oddNumbers.get(0);
                result[i] = min;
                oddNumbers.remove(oddNumbers.get(0));
            } else {
                result[i] = array[i];
            }
        }

        return result;
    }
}
