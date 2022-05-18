package leetcode.arrays.chapter4;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        while (walkingUp(A, N, i))
            i++;

        if (isFirstOrLastElement(N, i))
            return false;

        while (walkingDown(A, N, i))
            i++;

        return i == N-1;
    }

    private boolean walkingDown(int[] A, int N, int i) {
        return i+1 < N && A[i] > A[i+1];
    }

    private boolean walkingUp(int[] A, int N, int i) {
        return i+1 < N && A[i] < A[i+1];
    }

    private boolean isFirstOrLastElement(int N, int i) {
        return i == 0 || i == N-1;
    }
}
