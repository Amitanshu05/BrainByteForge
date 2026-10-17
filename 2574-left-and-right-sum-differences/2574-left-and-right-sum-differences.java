class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;

        int[] arr = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            totalSum += nums[i];
        }

        arr[0] = totalSum - nums[0];
        arr[arr.length-1] = totalSum - nums[nums.length-1];

        int leftSum = nums[0];

        for(int i = 1 ; i < nums.length - 1 ; i++){
            int rightSum = totalSum - leftSum - nums[i];
            arr[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        } 

        return arr;
        
    }
}