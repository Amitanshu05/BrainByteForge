class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p1 = 0;
        int p2 = n;

        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = new int[2*n];

        while(p2 != nums.length){
            al.add(nums[p1]);
            al.add(nums[p2]);

            p1++;
            p2++;
        }

        for(int i = 0 ; i < al.size() ; i++){
            arr[i] = al.get(i);
        }

        return arr;
    }
}