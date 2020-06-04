// Question:
// Reverse String

class Solution {
    public void reverseString(char[] s) {
        // Use 2 pointers one from the begining and the ending and swap till center

        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}