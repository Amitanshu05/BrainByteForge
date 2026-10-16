class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;

        int count = 0;

        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            hm.put(c , hm.getOrDefault(c , 0) + 1);
        }

        for(Character key : hm.keySet()){
            if(hm.get(key) % 2 != 0){
                count++;
                break;
            }
        }

        for(Character key : hm.keySet()){
            if(hm.get(key) % 2 == 0){
                count += hm.get(key);
            }

            else{
                int temp = hm.get(key);
                while(temp != 1){
                    count++;
                    temp--;
                }
            }
        }

        return count;
    }
}