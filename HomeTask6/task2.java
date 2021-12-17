package HomeTask6;

import java.util.ArrayList;
import java.util.List;


public class task2 {
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
        int CountOfThreads = 4, x = 3000000, y = 6000000, k = 0; 
        int step = (y - x) / CountOfThreads;
        long startTime = 0, endTime = 0;
        CustomThread[] threads = new CustomThread[CountOfThreads];

        startTime = System.currentTimeMillis();
        List<Integer> simpleNumbers = generateSimpleNumberList(y);

        for(int i = 0; i < CountOfThreads; i++)
        {
            CustomThread thread = new CustomThread();
            thread.init_thread(x, x + step, simpleNumbers);
            thread.start();
            x += step;
            threads[i] = thread;
        }
        for(CustomThread thread : threads)
        {
            try{
                thread.join();
                k += thread.get_count();
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Count of numbers: " + k);
        System.out.println("Time in ms: " + (endTime - startTime) + "ms");
        System.out.println("Count of threads: " + CountOfThreads);
    }
}

class CustomThread extends Thread
{
    private int x = 0;
    private int y = 0;
    private int k = 0;
    private List<Integer> simpleNumbers;

    public int get_count()
    {
        return k;
    }
    public void init_thread(int left, int right, List<Integer> sN)
    {
        x = left;
        y = right;
        simpleNumbers = sN;
    }
    @Override
    public void run()
    {
        for (long number = x; number < y; number++)
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
    }
}