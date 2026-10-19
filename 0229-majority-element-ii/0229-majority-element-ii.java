class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int n : nums){
            hm.put(n , hm.getOrDefault(n,0) + 1);
        }

        for(Integer key : hm.keySet()){
            if(hm.get(key) > nums.length/3){
                l.add(key);
            }
        }

        return l;
    }
}