class Solution:
    def twoSum(self, nums, target):
        dict = {}
        for i, n in enumerate(nums):
            if (target-n in dict):
                return [i, dict[target-n]]
            dict[n] = i
        
        