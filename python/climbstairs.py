class Solution:
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        steps = 0
        nums = [1, 2]
        for i in range(2, n):
            nums.append(nums[i-2] + nums[i-1])
        return nums[n-1]
        