
public class Kmp {
    // a b a b a c
    // 0 0 1 2 3 0
    
        public static int[] buildLPS(String pattern) {
            int n = pattern.length();
            int[] lps = new int[n];
            int len = 0;
            int i = 1;
    
            while (i < n) {
                if (pattern.charAt(i) == pattern.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i] = 0;
                        i++;
                    }
                }
            }
            return lps;
        }
        public static int KMPSearchCount(String text, String pattern) {
            int[] lps = buildLPS(pattern);
            int i = 0; 
            int j = 0; 
            int count = 0;
    
            while (i < text.length()) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == pattern.length()) {
                    count++;  
                    j = lps[j - 1]; // continue searching for next matches or just return true if ned to check  
                } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
            return count;
        }
  
    public static void main(String[] args) {
        
    }
}

