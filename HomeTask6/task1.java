package HomeTask6;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static boolean IsSimpleNumber(int number)
    {
        int j = 1;
        while (j <= Math.sqrt(number))
        {
            if (number % j == 0 && j != 1 && j != number)
                return false;
            j++;
        }
        return true;
    }
    public static List<Integer> generateSimpleNumberList(int y)
    {
        List<Integer> result = new ArrayList<>();
        int j = 2;

        while (j <= Math.sqrt(y))
        {
            if (IsSimpleNumber(j))
                result.add(j);
            j++;
        }
    
        return result;
    }
    public static void main(String[] args) {
        int x = 3000000, y = 6000000, k = 0;
        long startTime = 0, endTime = 0;

        startTime = System.currentTimeMillis();
        List<Integer> simpleNumbers = generateSimpleNumberList(y);
        
        for (int number = x; number < y; number++)
        {
            boolean isSimple = true;
            for (Integer simpleNumber : simpleNumbers)
            {
                if (number % simpleNumber == 0)
                {
                    isSimple = false;
                    break;
                }
            }
            if(isSimple)
                k++;
        }
        
        endTime = System.currentTimeMillis();

        System.out.println("Count of numbers: " + k);
        System.out.println("Time in ms: " + (endTime - startTime) + "ms");
    }
}
