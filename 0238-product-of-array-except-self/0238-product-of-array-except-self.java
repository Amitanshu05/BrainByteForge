class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        leftProd[0] = 1;

        int prod = 1;

        for(int i = 1 ; i < nums.length ; i++){
            prod *= nums[i-1];
            leftProd[i] = prod;
        }

        int[] rightProd = new int[nums.length];

        rightProd[nums.length-1] = 1;

        prod = 1;

        for(int i = nums.length - 2 ; i >= 0 ; i--){
            prod *= nums[i+1];
            rightProd[i] = prod;
        }

        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = leftProd[i] * rightProd[i];
        }

        return ans;
    }
}