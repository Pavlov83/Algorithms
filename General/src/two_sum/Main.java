package two_sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoSum testSum = new TwoSum();
        int[] testArray = {1,2,4,5,6,7,8,1};
        int[] result = testSum.calculateSum(testArray,9);
        System.out.println(Arrays.toString(result));

    }

}