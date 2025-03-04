import java.util.Arrays;

public class Sort2DArray {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {3, 2, 1},
            {2, 3, 1}
        };

        System.out.println("Original 2D array:");
        print2DArray(array);
        int[][] sortedArray = sort2DArray(array);

        System.out.println("Sorted 2D array:");
        print2DArray(sortedArray);
    }

    public static int[][] sort2DArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int totalElements = rows * cols;
        int[] flatArray = new int[totalElements];
        int index = 0;
        for (int[] row : array) {
            for (int num : row) {
                flatArray[index++] = num;
            }
        }
        Arrays.sort(flatArray);
        int[][] sortedArray = new int[rows][cols];
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sortedArray[i][j] = flatArray[index++];
            }
        }

        return sortedArray;
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
