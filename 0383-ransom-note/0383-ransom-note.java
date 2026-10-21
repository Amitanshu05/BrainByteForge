class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        int r = 0;
        int m = 0;


        while(r < ransomNote.length() || m < magazine.length()){

            if(r < ransomNote.length()){
                char rr = ransomNote.charAt(r);

                arr[rr - 'a'] --;

                r++;
            }
            
            if(m < magazine.length()){
                char mm = magazine.charAt(m);

                arr[mm - 'a']++;

                m++;
            }
        }

        for(int i= 0 ; i < arr.length ; i++){
            if(arr[i] < 0) return false;
        }

        return true;
    }
}