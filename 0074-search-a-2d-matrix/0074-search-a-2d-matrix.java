class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int p1 = 0;
        int p2 = m * n - 1;


        while(p1 <= p2){
            int mid = p1 + (p2 - p1) / 2;

            int row = mid / n;
            int col = mid % n;

            int element = matrix[row][col];

            if(element == target) return true;

            else if(element > target) p2 = mid - 1;

            else p1 = mid + 1;
        }

        return false;
    }
}