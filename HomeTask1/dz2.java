package HomeTask1;

import java.util.Scanner;
import java.lang.System;

public class dz2 {
    public static void main(String[] args) {
        String[] names = {"Tanya", "Masha", "Vika", "Rita", "Ilya", "Vova", "Misha", "Sergay", "Mark", "Dima"};
        
        Scanner userScanner = new Scanner(System.in, "cp1251");
        String myName = userScanner.next();

        for(int i = 0; i < names.length; i++)
        {
            if (myName.equals(names[i]))
            {
                System.out.println("Yes");
                break;
            }
            else if (i == names.length - 1)
                System.out.println("No");
        }
        userScanner.close();
    }
}
