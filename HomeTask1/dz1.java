package HomeTask1;

import java.lang.System;
import java.util.Scanner;

class dz1{
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in, "cp1251");
        
        System.out.println("Enter first number");
        String FirstNumber = userScanner.next();
        System.out.println("Enter operation");
        String Operation = userScanner.next();
        System.out.println("Enter second number");
        String SecondNumber = userScanner.next();

        

        int result = 0;
        switch(Operation)
        {
            case "+":
                result = Integer.parseInt(FirstNumber) + Integer.parseInt(SecondNumber);
                break;
            case "-":
                result = Integer.parseInt(FirstNumber) - Integer.parseInt(SecondNumber);
                break;
            case "*":
                result = Integer.parseInt(FirstNumber) * Integer.parseInt(SecondNumber);
                break;
            case "/":
                result = Integer.parseInt(FirstNumber) / Integer.parseInt(SecondNumber);
                break;
        }
        System.out.println("Result = " + result);  
        System.out.println("Enter n");
        String n = userScanner.next();
        System.out.println("y/n = " + result/Integer.parseInt(n));    
        userScanner.close();
    }
}