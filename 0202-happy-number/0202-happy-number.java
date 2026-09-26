class Solution {
    public static int SplitSum(int number){
        int sum = 0;
        int temp = number;
        while(temp != 0){
            int rem = temp % 10;
            int square = rem * rem;
            sum += square;
            temp /= 10;
        }

        return sum;
    } 
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(n);

        while(n != 1){
            n = SplitSum(n);
            if(!hs.add(n)){
                return false;
            }
        }

        return true;
    }
}