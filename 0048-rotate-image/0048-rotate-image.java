
class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Transpose the matrix
        for(int i = 0; i < m; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < m; i++){
            int p1 = 0;
            int p2 = n - 1;

            while(p1 < p2){
                int temp = matrix[i][p1];
                matrix[i][p1] = matrix[i][p2];
                matrix[i][p2] = temp;

                p1++;
                p2--;
            }
        }
    }
}
