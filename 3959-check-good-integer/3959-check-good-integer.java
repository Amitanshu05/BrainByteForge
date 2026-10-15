class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        int temp = n;

        while(temp != 0){
            int rem = temp % 10;

            digitSum += rem;
            squareSum += (rem*rem);

            temp /= 10;
        }

        return (squareSum - digitSum >= 50) ? true : false;
    }
}