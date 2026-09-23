class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns-1;
        while(row < rows && column >= 0){
            if(matrix[row][column] == target){
                return true;
            }
            if(matrix[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return false;
    }
}