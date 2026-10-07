class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder("");

        int spaceCount = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(spaceCount == k) break;

            if(c != ' ') sb.append(c);

            if(c == ' '){
                spaceCount++;
            }

            if(c == ' ' && spaceCount != k){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}