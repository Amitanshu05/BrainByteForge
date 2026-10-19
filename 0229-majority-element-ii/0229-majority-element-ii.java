class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int votes1 = 0;

        int candidate2 = 0;
        int votes2 = 0;


        for(int i = 0 ; i < nums.length ; i++){
            if(votes1 == 0 && nums[i] != candidate2){
                candidate1 = nums[i];
                votes1 = 1;
            }

            else if(votes2 == 0 && nums[i] != candidate1){
                candidate2 = nums[i];
                votes2 = 1;
            }

            else if(nums[i] == candidate1){
                votes1++;
            }

            else if(nums[i] == candidate2){
                votes2++;
            }

            else{
                votes1--;
                votes2--;
            }
        }

        int c1 = 0;
        int c2 = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == candidate1){
                c1++;
            }

            if(nums[i] == candidate2){
                c2++;
            }
        }

        List<Integer> l = new ArrayList<>();

        if(c1 > nums.length/3){
            l.add(candidate1);
        }

        if(c2 > nums.length/3 && (candidate1 != candidate2)){
            l.add(candidate2);
        }

        return l;
    }
}