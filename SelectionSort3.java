public class SelectionSort3 {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 2, 8, 1};

        System.out.println("Original Array:");
        printArray(arr);

    
        for (int i = 0; i < 3; i++) {
            int minvalue = i;
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[j] < arr[minvalue]) {
                    minvalue = j;
                }
            }
            
            int temp = arr[minvalue];
            arr[minvalue] = arr[i];
            arr[i] = temp;

            System.out.println("Step " + (i + 1) + ":");
            printArray(arr);
        }

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}