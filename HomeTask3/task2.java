package HomeTask3;

import java.util.Scanner;

public class task2
{
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in, "cp1251");

        String str = userScanner.next();
        userScanner.close();

        long startTime = 0, endTime = 0;
        String result = "";

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 20000; i++)
            result += str;
        endTime = System.currentTimeMillis();
        System.out.println("Time in ms (concatenation way): " + (endTime - startTime)/1000.0 + "ms");


        StringBuilder sb = new StringBuilder(str);

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 20000; i++)
            sb.append(str);
        endTime = System.currentTimeMillis(); 
        System.out.println("Time in ms (stringBuilder way): " + (endTime - startTime)/1000.0 + "ms");
    }
}