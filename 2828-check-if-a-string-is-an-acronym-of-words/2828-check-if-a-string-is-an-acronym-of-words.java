class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder("");
        for(String ss : words){
            sb.append(ss.charAt(0));
        }

        if(sb.toString().equals(s)) return true;
        else return false;
    }
}