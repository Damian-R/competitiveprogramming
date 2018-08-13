class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        streak, longest_streak = 0, 0
        for i, c1 in enumerate(s):
            seen = {}
            streak = 0
            for j, c2 in enumerate(s[i:]):
                if c2 not in seen:
                    streak += 1
                    seen[c2] = True
                    if streak > longest_streak:
                        longest_streak = streak
                else:
                    break
        return longest_streak
            

sol = Solution()
print(sol.lengthOfLongestSubstring("abcabcbb"))