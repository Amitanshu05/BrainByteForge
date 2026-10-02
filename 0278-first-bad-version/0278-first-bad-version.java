/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        int p1 = 1;
        int p2 = n;
        int firstV = Integer.MAX_VALUE;

        while(p1 <= p2){
            int mid = p1 + (p2 - p1) / 2;

            if(isBadVersion(mid) == true){
                firstV = Math.min(mid , firstV);
                p2 = mid - 1;
            }

            else{
                p1 = mid + 1;
            }
        }

        return firstV;


    }
}