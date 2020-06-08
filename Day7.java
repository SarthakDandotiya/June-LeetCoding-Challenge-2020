// Question:
// Coin Change 2
// !

class Solution {
    public int change(int amount, int[] coins) {
        int[] solutions = new int[amount + 1];
        solutions[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                solutions[i] += solutions[i - coin];
            }
        }
        return solutions[amount];
    }
}