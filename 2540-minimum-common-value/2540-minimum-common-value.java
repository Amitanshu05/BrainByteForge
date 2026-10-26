class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        for(int n : nums1){
            hm1.put(n , hm1.getOrDefault(n,0) + 1);
        }

        for(int n : nums2){
            hm2.put(n , hm2.getOrDefault(n,0) + 1);
        }

        for(int n : nums1){
            if(hm1.containsKey(n) && hm2.containsKey(n)) return n;
        }

        return -1;
    }
}