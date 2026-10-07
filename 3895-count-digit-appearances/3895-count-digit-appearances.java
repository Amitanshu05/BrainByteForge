class Solution {
    public int countOccurence(int number , int digit){
        int temp = number;
        int count = 0;

        while(temp != 0){
            int rem = temp % 10;
            if(rem == digit) count++;
            temp /= 10; 
        }

        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;

        for(int n : nums){
            ans += countOccurence(n ,digit);
        }

        return ans;
    }
}