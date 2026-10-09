class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int ans = 0;

        while (a >= b) {

            long temp = b;
            int multiple = 1;

            // Double divisor until it is still <= dividend
            while ((temp << 1) <= a) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            ans += multiple;
        }

        // Sign handling
        if ((dividend < 0) ^ (divisor < 0)) {
            return -ans;
        }

        return ans;
    }
}