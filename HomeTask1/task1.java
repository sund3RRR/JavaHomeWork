package HomeTask1;

import java.lang.System;
import java.util.Scanner;

class task1 {
    public static boolean IsInteger(String Number) {
        try {
            Integer.parseInt(Number);
            return true;
        } catch (Exception e) {
            System.out.println("Entered incorrect number. Please retry.");
            return false;
        }
    }
    public static boolean IsOperation(String Operation)
    {
        if (Operation.equals("+") || Operation.equals("-") || Operation.equals("*") || Operation.equals("/"))
            return true;
        else {
            System.out.println("Entered incorrect operation. Please retry.");
            return false;
            }
    }
    public static int Calculate(String FirstNumber, String Operation, String SecondNumber) {
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
        return result;
    }
    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in, "cp1251");
        String FirstNumber = "0";
        String Operation = "";
        String SecondNumber = "0";

        while(!IsInteger(FirstNumber) || !IsOperation(Operation) || !IsInteger(SecondNumber))
        {
            System.out.println("Enter first number");
            FirstNumber = userScanner.next();
            System.out.println("Enter operation");
            Operation = userScanner.next();
            System.out.println("Enter second number");
            SecondNumber = userScanner.next();
        }            

        int result = Calculate(FirstNumber, Operation, SecondNumber);

        System.out.println("Result = " + result);  
        System.out.println("Enter n");
        String n = userScanner.next();
        System.out.println("y/n = " + result/Integer.parseInt(n));    
        
        userScanner.close();
    }
}