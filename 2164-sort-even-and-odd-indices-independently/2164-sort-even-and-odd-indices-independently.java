class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> oddIndex = new ArrayList<>();
        ArrayList<Integer> evenIndex = new ArrayList<>();
        int[] ans = new int[nums.length];


        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                evenIndex.add(nums[i]);
            }else{
                oddIndex.add(nums[i]);
            }
        }

        Collections.sort(oddIndex , Collections.reverseOrder());
        Collections.sort(evenIndex);

        for(int i = 0 ; i < evenIndex.size() ; i++){
            ans[2 * i] = evenIndex.get(i);
        }

        for(int i = 0 ; i < oddIndex.size() ; i++){
            ans[2*i + 1] = oddIndex.get(i);
        }
        
        return ans;
    }
}