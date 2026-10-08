class Solution {
    public String longestPalindrome(String s) {
        int m = s.length();

        if (m <= 2) {
            if (m == 2 && s.charAt(0) == s.charAt(1)) {
                return s;  
            } else {
                return s.substring(0, 1);
            }
        }

        boolean allsem = true;
        for (int i = 1; i < m; i++) {
            if (s.charAt(i) != s.charAt(0)) {
                allsem = false;
                break;
            }
        }
        if (allsem) {
            return s;
        }

        int maxlength = 1;      
        int startIndex = 0;
        int n = s.length();
        char str[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i] == str[j]) {
                    int start = i;
                    int end = j;
                    boolean isPalindrome = true;

                    while (start <= end) {
                        if (str[start] != str[end]) {
                            isPalindrome = false;
                            break;
                        }
                        start++;
                        end--;
                    }

                    if (isPalindrome) {
                         int length = j - i + 1;
                        if (length > maxlength) {
                            maxlength = length;
                             startIndex = i;
                        }
                    }
                }
            }
        }

        return s.substring(startIndex, startIndex + maxlength);
    }
}
