class Solution {
    public boolean isPerfectSquare(int num) {
        long p1 = 1;
        long p2 = num;

        while(p1 <= p2){
            long mid = p1 + (p2 - p1) / 2;

            if(mid * mid == num) return true;

            else if(mid * mid > num) p2 = mid - 1;

            else p1 = mid + 1;   
        }

        return false;
    }
}