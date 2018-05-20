class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak = 0;
        int maxStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                streak++;
                if (streak > maxStreak) maxStreak = streak;
            }
            else streak = 0;
        }
        return maxStreak;
    }
}