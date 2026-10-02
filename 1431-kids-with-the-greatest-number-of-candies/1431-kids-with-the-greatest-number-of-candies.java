class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {   
        int highest = 0;
        for(int n : candies){
            highest = Math.max(n , highest);
        }

        List<Boolean> ans = new ArrayList<>();

        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= highest){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}