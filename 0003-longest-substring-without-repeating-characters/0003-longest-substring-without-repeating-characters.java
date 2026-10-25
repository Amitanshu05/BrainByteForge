class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        
        int len = s.length();
        int max_len = 0;

        HashSet<Character> set = new HashSet<>();

        while(r < len){
            char c = s.charAt(r);

            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(c);

            max_len = Math.max(max_len , r - l + 1);

            r++;

        }

        return max_len;

    }
}