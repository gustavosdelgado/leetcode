package leetcode.arrays.chapter3;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;                
                i++;
            }
        }
        return i;
    }
}
