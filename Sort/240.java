class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /** 단순 이중 반복문 O(m x n) */
        // boolean found = false;
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0;j< matrix[i].length; j++){
    //             if(matrix[i][j]==target){
    //                 found = true;
    //                 break;
    //             }
    //         }
    //         if(found){
    //             break;
    //         }
    //     }
    //     return found;
    // }

        /* 이진탐색 */
    //     for(int[] row : matrix) {
    //         int left = 0;
    //         int right = row.length -1;

    //         while(left <= right){
    //             int mid = left + (right -left)/2;
    //             if(row[mid] == target){
    //                 return true;
    //             } else if(row[mid]<target){
    //                 left = mid + 1;
    //             } else {
    //                 right = mid -1;
    //             }
    //         }

    //     }
    //     return false;
    // }

    /**투포인터 O (m + n)*/
    int row = 0;
    int col = matrix[0].length -1;

    while(row < matrix.length && col >=0){
        if(matrix[row][col] == target){
            return true;
        } else if(matrix[row][col] < target){
            row++;
        } else {
            col--;
        }
    }
    return false;
    }
}
