// Question:
//  Is Subsequence
// .

// import java.util.regex.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        // String toMatch = "[a-z]*";
        // for(char c: s.toCharArray()) {
        // toMatch+=(Character.toString(c) + "[a-z]*");
        // }
        // return Pattern.matches(toMatch,t);

        int x = 0;
        if (s.equals(""))
            return true;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(x)) {
                x++;
            }
            if (x == s.length())
                return true;
        }

        return false;
    }
}