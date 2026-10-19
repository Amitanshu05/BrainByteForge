class Solution {

    public boolean checkAnagram(String s1 , String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        int[] arr = new int[26];

        for(int i = 0 ; i < s1.length() ; i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for(int n : arr){
            if(n != 0) return false;
        }


        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> l = new ArrayList<>();

        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].equals("0")) continue;

            List<String> s = new ArrayList<>();
            s.add(strs[i]);

            for(int j = i+1 ; j < strs.length ; j++){
                if(strs[j].equals("0")) continue;

                if(checkAnagram(strs[i] , strs[j])){
                    s.add(strs[j]);
                    strs[j] = "0";
                }
            }

            l.add(s);

        }

        return l;
    }
}