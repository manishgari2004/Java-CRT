import java.util.Arrays;

public class CustomSort
{
    public static void main(String[] args)
    {
        int[] array = {6,3,7,2,8,1,5,4};
        int i = 0;
        int j = array.length -1;
        int minValue = -1;
        int maxValue = -1;
        int minIndex = -1;
        int maxIndex = -1;
        while (i < j)
        {
            minValue = array[i]; // 6
            maxValue = array[i]; // 6
            minIndex = i;
            maxIndex = i;
            // finding min value and min index
            for(int k = i+1; k < array.length; k++)
            {
                if(array[k] < minValue)
                {
                    minValue = array[k];
                    minIndex = k;
                }
            }
            // swapping min value
            int temp = array[i]; // 6
            array[i] = minValue; // 1
            array[minIndex] = temp;//
            // finding max value and max index;
            if(i < j-1)
            {
                for(int k = i+1; k <= j; k++)
                {
                    if(array[k] > maxValue)
                    {
                        maxValue = array[k];
                        maxIndex = k;
                    }
                }
                // swapping max value
                int temp2 = array[j]; // 6
                array[j] = maxValue; // 1
                array[maxIndex] = temp2;//
            }
            System.out.println(Arrays.toString(array));
            i++;
            j--;
        }
    }
}