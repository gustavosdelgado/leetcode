package leetcode.arrays.chapter1;

public class EvenDigits {

    public static int findNumbers(int[] nums) {
        int numbersWithEvenNumberDigits = 0;
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int divCount = 0;
            while(n!=0) {
                n = n/10;
                divCount++;
            }

            if (divCount%2 == 0) {
                numbersWithEvenNumberDigits++;
            }
        }
        return numbersWithEvenNumberDigits;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
    }
}
