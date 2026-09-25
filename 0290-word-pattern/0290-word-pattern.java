class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if(pattern.length() != arr.length) return false;

        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();

        for(int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            String str = arr[i];


            if(hm1.containsKey(c)){
                if(!hm1.get(c).equals(str)){
                    return false;
                }
            }
            else{
                hm1.put(c,str);
            }


            if(hm2.containsKey(str)){
                if(hm2.get(str) != c){
                    return false;
                }
            }
            else{
                hm2.put(str,c);
            }


        }

        return true;
    }
}