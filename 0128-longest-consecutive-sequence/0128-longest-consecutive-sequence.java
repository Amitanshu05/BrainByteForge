class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int n : nums){
            hs.add(n);
        }

        int maxlen = 0;

        for(Integer num : hs){
            int currentStreak = 0;

            if(hs.contains(num-1)){
                continue;
            }

            else{
                currentStreak = 1;

                while(true){
                    if(hs.contains(num+currentStreak)){
                        currentStreak++;
                    }
                    else{
                        break;
                    }
                }

                maxlen = Math.max(currentStreak,maxlen);
            }
        }

        return maxlen;
    }
}