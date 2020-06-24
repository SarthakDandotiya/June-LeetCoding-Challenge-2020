// Question:
// Single Number II
// .*

class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0, not_threes = 0;
        for (int n : nums) {
            twos |= (ones & n);
            ones ^= n;
            not_threes = ~(ones & twos);
            ones &= not_threes;
            twos &= not_threes;
        }

        return ones;
    }
}