class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int size = A.length;
        for (int i = 0; i < size; i++) {
            if (size % 2 == 1) A[i][size/2] = A[i][size/2] == 1 ? 0 : 1;
            for (int j = 0; j < size/2; j++) {
                int x = A[i][j];
                int y = A[i][size-j-1];
                
                A[i][size-j-1] = x == 1 ? 0 : 1;
                A[i][j] =        y == 1 ? 0 : 1;
            }
        }
        return A;
    }
}