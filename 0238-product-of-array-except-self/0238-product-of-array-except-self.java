class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int leftProduct = 1;

        for(int i = 0 ; i < ans.length ; i++){
            if(i != 0) leftProduct *= nums[i-1];
            ans[i] = leftProduct;
        }

        int rightProduct = 1;

        for(int i = ans.length - 1; i >= 0 ; i--){
            if(i != ans.length - 1) rightProduct *= nums[i+1];
            ans[i] *= rightProduct;
        }

        return ans;
    }
}