class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middleElement = nums[(nums.length - 1) / 2];

        for(int i = 0 ; i < nums.length ; i++){
            if(i != (nums.length - 1) / 2 && nums[i] == middleElement) return false;
        }

        return true;
    }
}