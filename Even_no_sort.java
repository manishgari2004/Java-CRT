import java.util.Arrays;

public class Even_no_sort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 8, 6};
        customSort(arr);
        
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void customSort(int[] arr) {

        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[arr.length - evenCount];
        int evenIndex = 0, oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num;
            } else {
                oddNumbers[oddIndex++] = num;
            }
        }

        Arrays.sort(evenNumbers);
        Arrays.sort(oddNumbers);
        reverseArray(oddNumbers);

        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] == 2) {
                for (int j = 0; j < evenNumbers.length; j++) {
                    if (evenNumbers[j] == 4) {
                        int temp = evenNumbers[i];
                        evenNumbers[i] = evenNumbers[j];
                        evenNumbers[j] = temp;
                        break;
                    }
                }
                break;
            }
        }

        evenIndex = 0;
        oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenNumbers[evenIndex++];
            } else {
                arr[i] = oddNumbers[oddIndex++];
            }
        }
    }

    private static void reverseArray(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}