class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstColZero = false;

        // Step 1: Check first column
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }

        // Step 2: Use first row and first column as markers
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Set cells to zero using markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 5: Handle first column
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}