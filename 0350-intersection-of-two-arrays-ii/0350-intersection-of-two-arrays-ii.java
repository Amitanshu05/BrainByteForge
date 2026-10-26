class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        ArrayList<Integer> al = new ArrayList<>();

        for(int n : nums1){
            hm1.put(n , hm1.getOrDefault(n,0) + 1);
        }

        for(int n : nums2){
            hm2.put(n , hm2.getOrDefault(n,0) + 1);
        }

        for(int n : nums1){
            if(hm1.containsKey(n) && hm2.containsKey(n) && hm1.get(n)!= 0){
                int mintimes = Math.min(hm1.get(n) , hm2.get(n));
                while(mintimes != 0){
                    al.add(n);
                    mintimes--;
                }

                hm1.put(n,0);
            }
        }

        int[] arr = new int[al.size()];

        for(int i = 0 ; i < al.size() ; i++){
            arr[i] = al.get(i);
        }

        return arr;


    }
}