public class Question240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int row = 0;
        int column = matrix[0].length - 1;
        while (row <= matrix.length - 1 && column >= 0) {
            if (matrix[row][column] == target)
                return true;
            else if (matrix[row][column] > target)
                column -= 1;
            else
                row += 1;
        }
        return false;
    }
}
