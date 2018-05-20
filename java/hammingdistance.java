class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((a & 1) == 1) count++;
            a = a >> 1;
        }
        return count;
    }
}