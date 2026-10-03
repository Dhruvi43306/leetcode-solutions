class Solution {
    public int myAtoi(String s) {

        int i = 0;
        long ans = 0;
        int sign = 1;
        boolean digitStarted = false;
        boolean signFound = false;

        while (i < s.length()) {

            // Leading spaces only
            if (s.charAt(i) == ' ') {
                if (signFound || digitStarted) {
                    break;
                }

                i++;
                continue;
            }

            // Sign
            else if (s.charAt(i) == '-' || s.charAt(i) == '+') {

                if (signFound || digitStarted) {
                    break;
                }

                signFound = true;

                if (s.charAt(i) == '-') {
                    sign = -1;
                }

                i++;
                continue;
            }

            // Digit
            else if (Character.isDigit(s.charAt(i))) {

                digitStarted = true;

                int digit = s.charAt(i) - '0';

                // Check overflow BEFORE multiplication
                if (sign == 1 &&
                    ans > (Integer.MAX_VALUE - digit) / 10) {
                    return Integer.MAX_VALUE;
                }

                if (sign == -1 &&
                    ans > (-(long)Integer.MIN_VALUE - digit) / 10) {
                    return Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
            }

            else {
                break;
            }

            i++;
        }

        return (int)(ans * sign);
    }
}