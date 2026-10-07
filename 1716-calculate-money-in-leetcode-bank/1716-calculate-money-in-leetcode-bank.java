class Solution {
    public int totalMoney(int n) {
        int finalMoney = 0;
        int lastSunMoney = 7;


        for(int i = 1 ; i <= n ; i++){
            if(i % 7 == 0){
                finalMoney += lastSunMoney;
                lastSunMoney += 1;
            }
            else{
                finalMoney += (i / 7) + (i % 7);
            }
        }

        return finalMoney;
    }
}