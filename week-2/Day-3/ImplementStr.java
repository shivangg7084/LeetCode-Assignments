public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int res = haystack.indexOf(needle);
            return res;
        }else{
            return -1;
        }
    }

}
