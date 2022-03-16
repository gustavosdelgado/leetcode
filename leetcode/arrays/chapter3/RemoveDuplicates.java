package leetcode.arrays.chapter3;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int validNumbersIndex = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[validNumbersIndex] = nums[i];
                validNumbersIndex++;
            }
        }
        return validNumbersIndex;
    }
}
