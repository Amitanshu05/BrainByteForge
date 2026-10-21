class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();

        String[] arr = s.split(" ");

        if(pattern.length() != arr.length) return false;

        for(int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            String ss = arr[i];


            if(!hm1.containsKey(c)){
                hm1.put(c,ss);
            }

            if(!hm1.get(c).equals(ss)) return false;


            if(!hm2.containsKey(ss)){
                hm2.put(ss,c);
            }

            if(hm2.get(ss) != c) return false;
        }

        return true;
    }
}