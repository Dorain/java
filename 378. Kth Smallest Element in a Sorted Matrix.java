public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int lo = matrix[0][0], hi = matrix[m-1][n-1];
        while(lo < hi){
            int count = 0, j = 0;
            int mid = lo + (hi-lo)/2;
            for(int i = 0; i < m; i++){
                for(j = 0; j < n; j++){
                    if(matrix[i][j] > mid){
                        break; // the key is to approach target using hi 
                    }
                }
                count += j;
            }
            if(count<k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}