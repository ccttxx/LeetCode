package lc.median_of_two_sorted_arrays;

import java.util.Arrays;

/**
 * @author caitianxiang
 */
public class Median {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] all = new int[len1 + len2];
        System.arraycopy(nums1, 0, all, 0, nums1.length);
        System.arraycopy(nums2, 0, all, nums1.length, nums2.length);
        Arrays.sort(all);
        boolean flag = (len1 + len2) % 2 != 0;
        int num = (len1 + len2) / 2;
        System.out.println(num);
        if (!flag) {
            int sum = all[num-1] + all[num];
            return (double)sum / 2;
        } else {
            return (double)all[num];
        }
    }
}
