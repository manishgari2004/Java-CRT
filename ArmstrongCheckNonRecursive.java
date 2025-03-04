public class ArmstrongCheckNonRecursive
{
    public static void main(String[] args)
    {
        int number = 153;
        int reminder = -1;
        // 153 % 10: 3
        //  153 / 10 : 15
        // 15 % 10 : 5
        // 15 / 10 : 1
        // 1 % 10 : 1
        // 1 / 10 : 0
        int total = 0;
        int remaining = number;
        while(remaining > 0)
        {
            reminder = remaining % 10;
            remaining = remaining / 10;
            System.out.println(" reminder "+reminder);
            System.out.println(" remaining "+remaining);
            total += reminder * reminder * reminder;
        }
        System.out.println("total "+total);
        if(total == number)
        {
            System.out.println(" number is armstrong");
        }
        else
        {
            System.out.println(" not armstrong");
        }
    }
}