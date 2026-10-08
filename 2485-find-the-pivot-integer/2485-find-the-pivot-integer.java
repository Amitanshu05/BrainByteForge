class Solution {
    public int sum(int x , int n){
        int sum = 0;
        for(int i = x ; i <= n ; i++){
            sum+= i;
        }

        return sum;
    }
    public int pivotInteger(int n) {
        for(int i = 1 ; i <= n ;i++){
            if(i*(i+1)/2  == sum(i,n)){
                return i;
            }
        }

        return -1;
    }
}