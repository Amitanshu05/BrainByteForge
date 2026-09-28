class Solution {
    public int alternateDigitSum(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0 ; i < num.length() ; i++){
            char c = num.charAt(i);
            int number = Character.getNumericValue(c);

            if(i % 2 == 0){
                sum += number;    
            }
            else{
                sum-=number;
            }
        }

        return sum;
    }
}