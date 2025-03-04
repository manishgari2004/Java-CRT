public class find_no_recursive {

    public static int countOccurrences(int[] arr, int target, int index) {
        if (index == arr.length) {
            return 0;
        }
        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 2};
        int target = 2;
        int count = countOccurrences(numbers, target, 0);
        System.out.println("Number " + target + " occurs " + count + " times.");
    }
}