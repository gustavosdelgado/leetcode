package leetcode.arrays.chapter4;

public class CheckIfExists {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int numberToCheck = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
            
        }
        
        return false;
    }
}
