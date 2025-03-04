public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1001, 1002, 1005, 1007, 1000,1008,1009};
        int key = 1008;
        int index = linearSearch(array, key);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; 
            }
        }
        return -1;
    }
}
