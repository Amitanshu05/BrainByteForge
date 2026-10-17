class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for(int i = 0 ; i < k ; i++){

            int min = Integer.MAX_VALUE;

            for(int j = 0 ; j < nums.length ; j++){
                min = Math.min(nums[j] , min);
            }

            for(int l = 0 ; l < nums.length ; l++){
                if(nums[l] == min){
                    nums[l] *= multiplier;
                    break;
                }
            }

        }

        return nums;
    }
}