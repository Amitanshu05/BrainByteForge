class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];

        int minlen = Integer.MAX_VALUE;

        for(String s : strs){
            minlen = Math.min(minlen,s.length());
        }

        StringBuilder sb = new StringBuilder("");

        for(int i = 0 ; i < minlen ; i++){
            int count = 0;

            for(String s : strs){

                if(s.charAt(i) == s1.charAt(i)){
                    count++;   
                }
            }

            if(count == strs.length) sb.append(s1.charAt(i));
            else break;
        }

        return sb.toString();
    }
}