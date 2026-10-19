class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = n * (n+1)/2;
        int arr_sum = 0;

        for(int nn : nums){
            arr_sum += nn;
        }

        return sum - arr_sum;
    }
}