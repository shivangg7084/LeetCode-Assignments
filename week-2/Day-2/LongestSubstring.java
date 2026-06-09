import java.util.*;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> s1 = new HashSet<>();
        int maxlen = 0;
        int left = 0;

        for(int right = 0; right<s.length(); right++){
            while(s1.contains(s.charAt(right))){
                s1.remove(s.charAt(left));
                left++;
            }

            s1.add(s.charAt(right));
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}

