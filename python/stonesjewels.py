class Solution:
    def numJewelsInStones(self, J, S):
        result = 0
        stones = {}
        for i in range(len(S)):
            if (S[i] not in stones):
                stones[S[i]] = 1
            else:
                stones[S[i]] += 1
        
        for i in range(len(J)):
            if (J[i] in stones):
                result += stones[J[i]]
            
        return result