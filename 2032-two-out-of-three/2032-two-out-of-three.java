class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();

        for(int n : nums1){
            hs1.add(n);
        }

        for(int n : nums2){
            hs2.add(n);
        }

        for(int n : nums3){
            hs3.add(n);
        }


        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer n : hs1){
            hm.put(n , hm.getOrDefault(n,0) + 1);
        }

        for(Integer n : hs2){
            hm.put(n , hm.getOrDefault(n,0) + 1);
        }

        for(Integer n : hs3){
            hm.put(n , hm.getOrDefault(n,0) + 1);
        }   

        List<Integer> li = new ArrayList<>();

        for(Integer key : hm.keySet()){
            if(hm.get(key) >= 2){
                li.add(key);
            }
        }

        return li;    

    }
}