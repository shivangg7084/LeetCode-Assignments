import java.util.*;
public class PermutationString {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length();
            int m = s2.length();
            int[] str1 = new int[26];
            int[] str2 = new int[26];
            if(n>m) return false;

            for(int i = 0; i < n; i++){
                str1[s1.charAt(i) - 'a']++;
            }
            int i = 0;
            int j = 0;
            while(j<m){
                str2[s2.charAt(j) - 'a']++;

                if((j-i+1)>n){
                    str2[s2.charAt(i) - 'a']--;
                    i++;
                }
                if(Arrays.equals(str1,str2)){
                    return true;
                }
                j++;
            }
            return false;
        }
    }

