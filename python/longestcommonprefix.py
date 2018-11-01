class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """        
        if len(strs) == 0:
            return ''
        prefix = ''
        for i in range(min(list(map(lambda e: len(e), strs)))):
            for j, e in enumerate(strs[:-1]):
                if strs[j][i] is not strs[j+1][i]:
                    return prefix
            prefix += strs[0][i]
        return prefix