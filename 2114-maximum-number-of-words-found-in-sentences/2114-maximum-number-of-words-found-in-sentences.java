class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(String s : sentences){
            int countWords = 0;
            for(int i = 0 ; i < s.length() ; i++){
                char c = s.charAt(i);
                if(c == ' '){
                    countWords++;
                }
            }
            countWords++;
            maxWords = Math.max(maxWords , countWords);
        }

        return maxWords;
    }
}