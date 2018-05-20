class Solution:
    def uniqueMorseRepresentations(self, words):
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        dict = {}
        
        for i, word in enumerate(words):
            str = ""
            for j in range(len(word)):
                str += morse[ord(word[j]) - 97]
            
            dict[str] = True
            
        return len(dict.keys())
        