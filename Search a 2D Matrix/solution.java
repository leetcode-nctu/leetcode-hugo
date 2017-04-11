public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int limit = matrix.length;
        for(int i = 0;i <limit;i++){
            if(target < matrix[i][0]) return false;
            if(i+1 < limit && target > matrix[i+1][0]) continue;
            for(int j = 0; j< matrix[i].length;j++)
                if(target == matrix[i][j]) return true;
        }
        return false;
    }
}