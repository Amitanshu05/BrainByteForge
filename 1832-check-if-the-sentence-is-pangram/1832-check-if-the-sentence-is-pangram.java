class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];

        for(int i = 0 ; i < sentence.length() ; i++){
            char c = sentence.charAt(i);
            arr[c - 'a']++;
        }

        for(int n : arr){
            if(n == 0) return false;
        }
        
        return true;
    }
}