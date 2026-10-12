class Solution {
    public int countPrimeSetBits(int left, int right) {
        int totalCount = 0;
        for(int i = left ; i <= right ; i++){
            int n = i;

            int c = 0;
            while(n != 0){
                n = n & (n - 1);
                c++;
            }
            int prr = 0;

            for(int j = 1 ; j <= c ; j++){
                if(c % j == 0){
                    prr++;
                }
            }

            if(prr == 2){
                totalCount++;
            }
        }

        return totalCount;
    }
}