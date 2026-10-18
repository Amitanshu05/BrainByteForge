class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int n : nums){
            String s = Integer.toString(n);

            for(int i = 0 ; i < s.length() ; i++){
                al.add(s.charAt(i) - '0');
            }
        }

        int[] arr = new int[al.size()];

        for(int i = 0 ; i < al.size(); i++){
            arr[i] = al.get(i);
        }
        
        return arr;
    }
}