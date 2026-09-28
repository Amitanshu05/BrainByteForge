class Solution {
    public int sumDigits(int n){
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        return sum;
    }
    public int addDigits(int num) {
        int sum = sumDigits(num);
        
        while(true){
            if(sum <= 9){
                break;
            }

            else{
              sum = sumDigits(sum);
            }
        }

        return sum;
        
    }
}