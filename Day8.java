// Question
// Power of Two
// *

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n <= 0 ? false : (n & n - 1) == 0;
    }
}