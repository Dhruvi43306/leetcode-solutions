
class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        backtrack(s, 0, temp, ans);

        return ans;
    }

    void backtrack(String s, int start,List<String> temp,List<List<String>> ans) {

        if (start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            if (isPalindrome(s, start, end)) {
                temp.add(s.substring(start, end + 1));

                backtrack(s, end + 1, temp, ans);

                temp.remove(temp.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
