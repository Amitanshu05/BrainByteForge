class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans = 0;

        for(int i = 1 ; i <= 2000 ; i++){
            boolean flag = true;

            for(int num : arr){

                if(num == i){
                    flag = false;
                    break;
                }

            }

            if(flag == true) ans ++;

            if(ans == k) {
                ans = i;
                break;
            }

        }

        return ans;
    }
}