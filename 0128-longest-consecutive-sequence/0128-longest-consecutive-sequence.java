class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int p1 = 0;

        int currentStreak = 1;
        int maxStreak = 0;

        while(p1 < nums.length - 1){

            if(nums[p1] + 1 == nums[p1+1]){
                currentStreak++;
                p1++;
            }

            else if(nums[p1] == nums[p1+1]){
                p1++;
            }

            else{
                maxStreak = Math.max(currentStreak,maxStreak);
                currentStreak = 1;
                p1++;
            }

        }

        maxStreak = Math.max(currentStreak,maxStreak);

        return maxStreak;


    }
}