class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;    // Rows
        int n = mat[0].length; // Columns
        int r=0;
        int c=0;

        int[] res = new int[m*n];

        for (int i = 0; i < res.length; i++) {
            res[i] = mat[r][c];
            // Move up
            if ((r + c) % 2 == 0) {
                if (c == n - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            }
            // Move down
            else {
                if (r == m - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return res;
    }
}