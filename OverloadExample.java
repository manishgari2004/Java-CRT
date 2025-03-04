class OverloadExample {
    
    public void process(String text) {
        String[] words = text.split("\\s+"); 
        System.out.println("Number of words in string: " + words.length);
    }

    public void process(int[] numbers) {
        int sum = 0;
       for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.process("Hello Java method overloading");
        int[] arr = {10, 20, 30, 40, 50};
        obj.process(arr);
    }
}
