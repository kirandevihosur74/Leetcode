class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        // Storing rows and columns length
        int rows = mat.length;
        int cols = mat[0].length;

        // checking the condition
        if ((rows * cols) != (r * c)) {
            return mat;
        }
        // Creating temporary matrix to reshape the original matrix
        int[][] res = new int[r][c];
        int res_rows = 0;
        int res_cols = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[res_rows][res_cols] = mat[i][j];
                res_cols++;

                if (res_cols == c) {
                    res_cols = 0;
                    res_rows++;
                }
            }
        }
        return res;
    }
}