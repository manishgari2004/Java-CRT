public class SelectionSort2 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int minvalue = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minvalue]) {
                    minvalue = j;
                }
            }
            int temp = arr[minvalue];
            arr[minvalue] = arr[i];
            arr[i] = temp;
            System.out.print("Step " + (i + 1) + ": ");
            printArray(arr);
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 7, 2, 8, 1};
        System.out.println("Initial Array: ");
        printArray(arr);
        selectionSort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
