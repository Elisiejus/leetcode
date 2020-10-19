package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] subArrayInt(int[] numbers, int target) {

        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (num_map.containsKey(complement)) {
                return new int[]{num_map.get(complement), i};
            }
            num_map.put(numbers[i], i);
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subArrayInt(new int[]{1, 23, 4, 2, 6}, 3)));
    }
}