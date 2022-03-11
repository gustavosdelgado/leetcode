package leetcode.arrays.chapter1;

public class SquareSortedArrays {

    private int [] newArray;
    private int arrayStart = 0;
    private int arrayEnd;
    private int insertPosition;

    public int[] sortedSquares(int[] nums) {
        newArray = new int[nums.length];
        arrayEnd = nums.length - 1;
     
        insertPosition = arrayEnd;
        while (leftAndRightHaventMet()) {
            int squareFromLeft = square(nums[arrayStart]);
            int squareFromRight = square(nums[arrayEnd]);

            if (squareFromLeft > squareFromRight) {
                insertElementAndGoToNextPointOfArray(squareFromLeft);
                arrayStart++;
            } else {
                insertElementAndGoToNextPointOfArray(squareFromRight);
                arrayEnd--;
            }
        }
        return newArray;
    }

    private boolean leftAndRightHaventMet() {
        return arrayStart <= arrayEnd;
    }

    private int square(int n) {
        return n * n;
    }

    private void insertElementAndGoToNextPointOfArray(int element) {
        newArray[insertPosition--] = element;
    }

}
