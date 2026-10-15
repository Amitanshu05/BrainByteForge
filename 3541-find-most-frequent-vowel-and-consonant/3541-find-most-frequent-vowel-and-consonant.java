class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            arr[c - 'a'] ++;
        }

        int consonentFreq = 0;
        int vowelFreq = 0;


        for(int i = 0 ; i < 26 ; i++){
            if(i == 0 || i == 8 || i == 14 || i == 4 || i == 20){
                vowelFreq = Math.max(vowelFreq , arr[i]);
            }

            else{
                consonentFreq = Math.max(consonentFreq , arr[i]);
            }
        }

        return consonentFreq + vowelFreq;
    }
}