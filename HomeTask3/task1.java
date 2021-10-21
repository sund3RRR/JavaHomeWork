package HomeTask3;

import java.util.Scanner;

public class task1 {

    public static void ProcessString(String source)
    {
        String[] array = source.split(" ");
        int countOfSymbols = 0, countOfStrings = 0, maxLength = 0;

        for (String item : array)
        {
            countOfStrings++;
            int len = item.length();
            countOfSymbols += len;

            if(len > maxLength)
                maxLength = len;
        }
        System.out.println("Count of symbols = " + Integer.toString(countOfSymbols));
        System.out.println("Count of strings = " + Integer.toString(countOfStrings));
        System.out.println("Max string length = " + Integer.toString(maxLength));
    }
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in, "cp1251");

        String source = userScanner.nextLine();
        userScanner.close();
        
        ProcessString(source);
    }
}
