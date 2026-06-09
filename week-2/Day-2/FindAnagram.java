import java.util.*;
public class FindAnagram {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();

            int[] scount = new int[26];
            int[] pcount = new int[26];

            for(char ch : p.toCharArray()){
                pcount[ch - 'a']++;
            }
            int left = 0;
            for(int right = 0; right<s.length(); right++){
                scount[s.charAt(right) - 'a']++;

                while(right - left + 1 > p.length()){
                    scount[s.charAt(left) - 'a']--;
                    left++;
                }

                if(right - left + 1 == p.length()){
                    if(Arrays.equals(pcount, scount)){
                        result.add(left);
                    }
                }
            }
            return result;

        }

}
