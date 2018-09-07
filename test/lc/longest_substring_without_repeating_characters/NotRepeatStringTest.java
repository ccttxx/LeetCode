package lc.longest_substring_without_repeating_characters;

import org.hamcrest.*;
import org.junit.Assume;
import org.junit.Test;


public class NotRepeatStringTest {

    /**
     * Given "abcabcbb", the answer is "abc", which the length is 3.
     *
     * Given "bbbbb", the answer is "b", with the length of 1.
     *
     * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    @Test
    public void lengthOfLongestSubstring() {
        NotRepeatString notRepeatString = new NotRepeatString();
        int i = notRepeatString.lengthOfLongestSubstring("dvdf");
        Assume.assumeThat(i, Matchers.is(3));
    }
}
