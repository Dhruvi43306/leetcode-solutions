// String a = new String("test");
// String b = new String("test");
// String c = a; // c now points to the same object as a

// System.out.println(a == b);      // false (different objects)
// System.out.println(a.equals(b)); // true (same content)
// System.out.println(a == c);      // true (same object)



class Solution {
    public int strStr(String haystack, String needle) {
     return findIndex(haystack,needle,0);
    }
      int findIndex(String haystack, String needle,int i){
        int n = haystack.length();
        int m = needle.length();

        if(i > n - m){
            return -1;
        }
        if(haystack.substring(i,i+m).equals(needle)){
            return i;
        }
        return  findIndex(haystack,needle,i+1);
        }
}