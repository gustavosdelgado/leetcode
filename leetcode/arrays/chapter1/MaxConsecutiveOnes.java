package leetcode.arrays.chapter1;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes = 0;
        int maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveOnes++;
            } else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
                consecutiveOnes = 0;
            }
        }
        return Math.max(maxConsecutiveOnes, consecutiveOnes);
    }
}
