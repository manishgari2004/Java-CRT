import java.util.Arrays;

public class SwapArrayRecursively {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Swap elements recursively
        swapArray(array, 0);

        System.out.println("Swapped Array: " + Arrays.toString(array));
    }

    // Recursive method to swap elements pairwise
    public static void swapArray(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return; // Base case: Stop when there are no more pairs to swap
        }

        // Swap current element with the next one
        int temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;

        // Recursive call for the next pair
        swapArray(arr, index + 2);
    }
}
