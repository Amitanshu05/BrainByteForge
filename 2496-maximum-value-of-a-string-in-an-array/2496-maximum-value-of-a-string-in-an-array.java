class Solution {
    public int maximumValue(String[] strs) {
        int maxCount = 0;
        for(int i = 0 ; i < strs.length ; i++){
            int count = 0;
            String s = strs[i];

            int digitCount = 0;
            int alphabetCount = 0;

            for(int j = 0 ; j < s.length() ; j++){
                char c = s.charAt(j);
                if(Character.isLetter(c)){
                    alphabetCount++;
                }else{
                    digitCount++;
                }
            }
            if(s.length() == digitCount){
                int num = Integer.parseInt(s);
                count = num;
            }
            else{
                count = s.length();
            }

            maxCount = Math.max(maxCount , count);
        }

        return maxCount;
    }
}