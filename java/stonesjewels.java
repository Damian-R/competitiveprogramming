class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!hm.containsKey(c)) hm.put(c, 1);
            else hm.put(c, hm.get(c) + 1);
        }
        
        int result = 0;
        
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            if (hm.containsKey(c)) result += hm.get(c);
        }
        
        return result;
    }
}