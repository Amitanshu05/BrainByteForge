class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i++){

            HashSet<Character> hs1 = new HashSet<>();

            for(int j = 0 ; j < 9 ; j++){

                char c = board[i][j];

                if(c != '.' && !hs1.add(c)) return false;
                
            }
        }


        for(int i = 0 ; i < 9 ; i++){

            HashSet<Character> hs2 = new HashSet<>();

            for(int j = 0 ; j < 9 ; j++){

                char c = board[j][i];

                if(c != '.' && !hs2.add(c)) return false;
                
            }
        }


        for(int i = 0 ; i <= 6 ; i+=3){

            for(int j = 0 ; j <= 6 ; j+=3){

                HashSet<Character> hs3 = new HashSet<>();

                for(int startRow = i ; startRow <= i + 2 ; startRow++){

                    for(int startCol = j ; startCol <= j + 2 ; startCol++){

                        char c = board[startRow][startCol];

                        if(c != '.' && !hs3.add(c)) return false;

                    }
                }
            }
        }

        return true;
    }
}