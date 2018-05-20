class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    
                    if (i > 0) {
                        if (grid[i - 1][j] == 0) perimeter++;
                    }
                    if (i < grid.length - 1) {
                        if (grid[i + 1][j] == 0) perimeter++;
                    }
                    
                    if (j > 0) {
                        if (grid[i][j - 1] == 0) perimeter++;
                    }
                    if (j < grid[0].length - 1) {
                        if (grid[i][j + 1] == 0) perimeter++;
                    }
                    
                    if (i + 1 > grid.length - 1)    perimeter++;
                    if (i - 1 < 0)                  perimeter++;
                    if (j + 1 > grid[0].length - 1) perimeter++;
                    if (j - 1 < 0)                  perimeter++;
                    
                }
            }
        }
        return perimeter;
    }
}