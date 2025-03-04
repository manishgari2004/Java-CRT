public class ArmstrongCheckRecursive {
    public static void main(String[] args) {
        int number = 153;
        int numDigits = countDigits(number); 

        int total = calculateArmstrong(number, numDigits);

        System.out.println("Total: " + total);
        if (total == number) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
    public static int calculateArmstrong(int num, int power) {
        if (num == 0) {
            return 0;
        }

        int reminder = num % 10;
        int remaining = num / 10; // Remove last digit

        System.out.println("Reminder: " + reminder);
        System.out.println("Remaining: " + remaining);

        return (int) Math.pow(reminder, power) + calculateArmstrong(remaining, power); // Recursive call
    }

    // Recursive function to count number of digits
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10); // Recursive call to count digits
    }
}
