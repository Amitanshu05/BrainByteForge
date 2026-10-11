class Solution {
    public int sumOfSquares(int[] nums) {
        int i = 1;
        int sum = 0;

        while(i <= nums.length){
            if(nums.length % i == 0){
                sum += (nums[i-1]*nums[i-1]);
            }
            i++;
        }

        return sum;
    }
}