package makeArrayConsecutive;

import java.util.Arrays;

public class MakeArrayConsecutive {

    public static void main(String[] args) {

        MakeArrayConsecutive makeArrayConsecutive = new MakeArrayConsecutive();
        System.out.println(makeArrayConsecutive.makeArrayConsecutive2(new int[]{6, 2, 3, 8}));
    }

    public int makeArrayConsecutive2(int[] statues) {

        Arrays.sort(statues);
        int count = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            count += (statues[i + 1] - (statues[i] + 1));
        }
        return count;
    }
}