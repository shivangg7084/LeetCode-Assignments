public class Repeated {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            for(int l = n/2; l>0; l--){
                if(n % l == 0){
                    int times = n/l;
                    String pattern = s.substring(0,l);
                    StringBuilder newstr = new StringBuilder();

                    while(times > 0){
                        newstr.append(pattern);
                        times--;
                    }
                    if(s.equals(newstr.toString())){
                        return true;
                    }
                }
            }
            return false;
        }
    }

