// Question:
// Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                ans = i;
                flag = true;
                break;
            }
        }
        return flag ? ans : nums.length;
    }
}