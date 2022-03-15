package leetcode.arrays.chapter2;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int endOfNums1 = m - 1;
        int endOfNums2 = n - 1;
        
        for (int p = m + n - 1; p >= 0; p--) {
            if (endOfNums2 < 0) {
                break;
            }
            if (endOfNums1 >= 0 && nums1[endOfNums1] > nums2[endOfNums2]) {
                nums1[p] = nums1[endOfNums1--];
            } else {
                nums1[p] = nums2[endOfNums2--];
            }
        }
    }
}