class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int p1 = 0;
        int p2 = letters.length - 1;

        char ans = letters[0];

        while(p1 <= p2){
            int mid = p1 + (p2 - p1) / 2;

            if(letters[mid] - 'a' > target - 'a'){
                ans = letters[mid];
                p2 = mid - 1;
            }

            else p1 = mid + 1;
        }     

        return ans;
    }
}