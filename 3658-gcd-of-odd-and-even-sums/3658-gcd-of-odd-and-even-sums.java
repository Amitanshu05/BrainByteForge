class Solution {
    public int gcdNum(int a , int b){
        if(a % b == 0) return b;

        return gcdNum(b , a % b);
    }

    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n+1);
        int oddSum = n * n;

        return gcdNum(oddSum , evenSum);
    }
}