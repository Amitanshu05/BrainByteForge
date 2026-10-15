class Solution {
    public int[] countOppositeParity(int[] nums) {
        if(nums.length == 1) return new int[]{0};

        int[] arr = new int[nums.length];

        for(int i = 0 ; i < nums.length - 1 ; i++){
            int val = 0;

            if(nums[i] % 2 == 0){

                for(int j = i+1 ; j < nums.length ; j++){
                    if(nums[j] % 2 != 0) val++;
                }

                arr[i] = val;
            }

            else{

                for(int j = i+1 ; j < nums.length ; j++){
                    if(nums[j] % 2 == 0) val++;
                }

                arr[i] = val;
            }
            
        }

        arr[nums.length - 1] = 0;

        return arr;
    }
}