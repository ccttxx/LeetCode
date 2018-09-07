package lc.median_of_two_sorted_arrays;

import org.hamcrest.Matchers;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assume;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class MedianTest {

    public static void main(String[] args) {
        Median m = new Median();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3};
        double result = m.findMedianSortedArrays(nums1, nums2);
        Assume.assumeThat(result, Matchers.is(2.0));
    }
}
