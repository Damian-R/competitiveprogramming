class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        String s = Integer.toString(x);
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}