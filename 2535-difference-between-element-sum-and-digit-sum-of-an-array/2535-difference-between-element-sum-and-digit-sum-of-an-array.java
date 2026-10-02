class Solution {
    public static int digitSum(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitsum = 0;


        for(int n : nums){
            elementSum += n;
            digitsum += digitSum(n);
        }

        return Math.abs(elementSum - digitsum);
    }
}