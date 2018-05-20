class Solution:
    def maxIncreaseKeepingSkyline(self, grid):
        maxrows, maxcols, result = [], [], 0
        for i in range(len(grid)):
            maxrows.append(self.maxRow(grid, i))
            maxcols.append(self.maxCol(grid, i))
        
        for i in range(len(grid)):
            for j in range(len(grid)):
                result += min(maxrows[i], maxcols[j]) - grid[i][j]
        
        return result
        
    def maxRow(self, grid, rownum):
        return max(grid[rownum])
    def maxCol(self, grid, colnum):
        max = 0
        for i, row in enumerate(grid):
            if row[colnum] > max:
                max = row[colnum]
        return max