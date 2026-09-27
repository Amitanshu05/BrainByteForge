class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] freq = new int[101];

        for(int i = 0 ; i < nums.length ; i++){
            freq[nums[i]]++;
        }

        int counter = 0;
        while(counter != nums.length){
            for(int i = 0 ; i < freq.length;i++){
                if(freq[i] > 0){
                    list.add(i);
                    counter++;
                    freq[i]--;
                }
            }
        }

        int[] ans = new int[nums.length];

        for(int i = 0 ; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}