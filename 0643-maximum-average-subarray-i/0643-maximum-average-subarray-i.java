class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length <= 1) return nums[0];
        double sum = 0;
        double maxSum = Double.NEGATIVE_INFINITY;

        double[] arr = new double[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        double summ = 0;

        for(int i = k-1 ; i < nums.length ; i++){
            if(i - k < 0){
                summ = arr[i];
            }

            else summ = arr[i] - arr[i-k] ;

            maxSum = Math.max(summ,maxSum);
        }

        return maxSum / k;

    }
}