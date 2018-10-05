class Solution:
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle is '':
            return 0
        if len(needle) > len(haystack):
            return -1
        for i in range(len(haystack) - len(needle) + 1):
            if haystack[i] is needle[0]:
                for j, c2 in enumerate(needle):
                    if haystack[i+j] is not c2:
                        break
                    if j == len(needle) - 1:
                        return i
        return -1
        
print(Solution().strStr('a', 'a'))