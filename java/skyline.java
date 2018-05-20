class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int newHeight = Math.min(maxRow(grid, i), maxCol(grid, j));
                sum += newHeight - grid[i][j];
                grid[i][j] = newHeight;
            }
        }
        return sum;
    }
    
    public int maxRow(int[][] grid, int row) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[row][i] > max) max = grid[row][i];
        }
        return max;
    }
    
    public int maxCol(int[][] grid, int col) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] > max) max = grid[i][col];
        }
        return max;
    }
}