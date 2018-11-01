class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        maxlength, string = 0, ''
        for i in range(2*len(s) - 1):
            start, double = (i, False) if i < len(s) else (i - len(s), True)
            x, length = 0, 0
            startind, endind = (start - x, start + x) if not double else (start, start + 1)
            while (startind > -1) and (endind < len(s)) and (s[startind] == s[endind]):
                if startind == endind:
                    length -= 1
                length += 2
                if length > maxlength:
                    maxlength = length
                    string = s[startind:endind+1]
                startind -= 1
                endind += 1
        return string