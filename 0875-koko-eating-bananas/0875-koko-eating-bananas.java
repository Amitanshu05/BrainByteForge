class Solution {

    public long hoursAtGivenSpeed(int[] piles, int speed) {
        long hours = 0;

        for (int pile : piles) {
            hours += (long) Math.ceil((double) pile / speed);
        }

        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int maxPile = 0;

        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = hoursAtGivenSpeed(piles, mid);

            if (hours > h) {
                // Koko too slow
                low = mid + 1;
            } else {
                // Speed works, try smaller
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }
}