public class Search2DMatrix {




    public static boolean searchMatrix(int[][] matrix, int target) {
        int searchRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            searchRow = i;
            if (matrix[i][matrix[0].length - 1] == target) {
                return true;
            } else if (matrix[i][matrix[0].length - 1] > target) {
                break;
            }
        }

        int low = 0;
        int high = matrix[searchRow].length - 1;
        int mid = low + (high - low) / 2;

        while (low < high) {
            if (matrix[searchRow][mid] == target) return true;
            if (matrix[searchRow][mid] > target) {
                high = mid;
                mid = (high + low) / 2;
            } else {
                low = mid + 1;
                mid = (low + (high - low) / 2);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 13;

        System.out.println(searchMatrix(matrix, target));




    }


}
