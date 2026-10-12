class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int x : nums1){
            for(int i = 0 ; i < nums2.length ; i++){
                if(x == nums2[i]){
                    boolean flag = true; 
                    for(int j = i ; j < nums2.length ; j++){
                        if(nums2[j] > x){
                            al.add(nums2[j]);
                            flag = false;
                            break;
                        }
                    }
                    if(flag == true){
                        al.add(-1);
                    }
                    
                }
            }
        }

        int[] ans = new int[nums1.length];
        for(int i = 0 ; i < al.size() ; i++){
            ans[i] = al.get(i);
        }

        return ans;
    }
}