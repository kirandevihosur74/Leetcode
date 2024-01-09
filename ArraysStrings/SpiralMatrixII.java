class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int left = 0, right = n-1;
        int top = 0, bottom = n-1;
        int num=1;

        while(top<=bottom && left<=right){

            //moving left to right
            for(int i=left;i<=right;i++){
                arr[top][i] = num++;
            }
            top++;

            //moving top to bottom
            for(int i=top;i<=bottom;i++){
                arr[i][right] = num++;
            }
            right--;

            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    arr[bottom][i] = num++;
                }
                bottom--;

                for(int i=bottom;i>=top;i--){
                    arr[i][left] = num++;
                }
                left++;
            }
        }
        return arr;
    }
}