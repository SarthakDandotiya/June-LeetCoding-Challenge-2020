// Question:
// Largest Divisible Subset
// .!

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        int n = nums.length;

        // Container to keep the largest divisible subset
        // that ends with each of the nums.
        List<List<Integer>> list = new ArrayList();
        for (int i = 0; i < n; i++)
            list.add(new ArrayList());

        // Sort the nums array
        Arrays.sort(nums);

        // Calculate largest divisible subset for each i
        for (int i = 0; i < n; ++i) {
            List<Integer> maxSubset = new ArrayList();
            // Find the largest divisible subset for j.
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && maxSubset.size() < list.get(j).size())
                    maxSubset = list.get(j);
            }

            // Extend the found subset with the i th element.
            list.get(i).addAll(maxSubset);
            list.get(i).add(nums[i]);
        }

        // Find the largest of the largest divisible subset(by size)
        List<Integer> res = new ArrayList();
        for (int i = 0; i < n; ++i) {
            if (res.size() < list.get(i).size())
                res = list.get(i);
        }

        return res;
    }
}