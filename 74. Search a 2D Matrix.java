/*
74. Search a 2D Matrix
https://leetcode.com/problems/search-a-2d-matrix/
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length;
        int cols = matrix[0].length-1;
        int sr = 0;
        int sc = cols;
        while(sr < rows && sc > -1) {
            if(matrix[sr][sc] == target)
                return true;
            if(matrix[sr][sc] < target)
                sr++;
            else
                sc--;
        }
        return false;
    }
}