package lc.longest_substring_without_repeating_characters;

import java.util.ArrayList;

/**
 * @author caitianxiang
 */
public class NotRepeatString {

    public int lengthOfLongestSubstring(String s) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            if (!arrayList.contains(tmp)) {
                arrayList.add(tmp);
            }
        }
        int len = arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = String.join("", arrayList);
            System.out.println(str);
            if (i > 0) {
                str = str.substring(i, len);
                System.out.println(str);
            }
            if (s.indexOf(str) > -1) {
                len = str.length();
                break;
            }
        }
        return len;
    }
}
