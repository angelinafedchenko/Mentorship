package arrays;

public class Multi_arrays3 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int k = 0; k < nums.length; k ++) {
            for (int j = 0; j < nums[k].length; j++) {
                System.out.printf("%d ", nums[k][j]);
                //Сначала создается цикл для перебора по строкам, а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки.
            }
        }
    }
}
