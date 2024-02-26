class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for(int i = 0; i < m; i++){
            if(rowZero[i]){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < n; j++){
            if(colZero[j]){
                for(int i = 0; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}