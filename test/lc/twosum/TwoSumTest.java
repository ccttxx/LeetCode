package lc.twosum;

import java.util.Arrays;


public class TwoSumTest {

    @org.junit.Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] param1 = {3, 11, 15, 7};
        int param2 = 9;
        int[] result = twoSum.twoSum(param1, param2);
        System.out.println(Arrays.toString(result));
    }
}
