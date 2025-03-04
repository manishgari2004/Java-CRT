import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 2, 8, 1};

        selectionSort(arr);

        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
            System.out.println("Step " + (n - i) + ": " + Arrays.toString(arr));
        }
    }
}