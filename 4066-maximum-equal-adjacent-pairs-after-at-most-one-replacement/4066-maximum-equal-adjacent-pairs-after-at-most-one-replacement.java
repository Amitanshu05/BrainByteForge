class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        HashMap<String , Integer> hm = new HashMap<>();

        int baseCount = 0;
        

        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == nums[i+1]){
                baseCount++;
            }
            else{
                int u = Math.min(nums[i] , nums[i+1]);
                int v = Math.max(nums[i] , nums[i+1]);

                String key = u+"#"+v;
                hm.put(key, hm.getOrDefault(key,0) + 1);
            }
        }

        int maxFreq = 0;
        for(String key : hm.keySet()){
            maxFreq = Math.max(hm.get(key) , maxFreq);
        }

        return baseCount + maxFreq;

    }
}