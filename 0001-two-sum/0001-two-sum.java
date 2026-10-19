class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force to nested for loop mein if condition laga ke check kar lenge if nums[i] + nums[j] == target where i iterates from 0 and j iterates from i+1

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            int complement = target - nums[i];

            if(!hm.containsKey(complement)){
                hm.put(nums[i] , i);
            }

            else{
                return new int[]{hm.get(complement) , i};
            }
        }

        return new int[]{-1,-1};
    }
}