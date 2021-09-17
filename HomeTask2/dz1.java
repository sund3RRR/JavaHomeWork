package HomeTask2;

import java.util.Scanner;

public class dz1 {
        public static boolean IsInteger(String Number) {
            try {
                Integer.parseInt(Number);
                return true;
            } 
            catch (Exception e) {
                System.out.println("Entered incorrect number. Please retry.");
                return false;
            }
        }
        public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in, "cp1251");

        while(true)
        {
            Car MyCar = new Car();
            System.out.println("Enter model");
            MyCar.model = userScanner.next();
            
            System.out.println("Enter maxspeed");
            String MaxSpeed = userScanner.next();
            while(!IsInteger(MaxSpeed))
            {
                System.out.println("Enter maxspeed");
                MaxSpeed = userScanner.next();
            }
            MyCar.maxSpeed = Integer.parseInt(MaxSpeed); 
            
            System.out.println("Enter weight");
            String Weight = userScanner.next();
            while(!IsInteger(Weight))
            {
                System.out.println("Enter weight");
                Weight = userScanner.next();
            }
            MyCar.weight = Integer.parseInt(Weight); 

            MyCar.Show();
        }
    }
}
class Car
{
    String model;
    int maxSpeed;
    int weight;   
    Car()
    {
        model = "Undefined";
        maxSpeed = 0;
        weight = 0;
    }
    void Show()
    {
        if(!model.equals("Undefined"))
            System.out.println("model - " + model);
        if(maxSpeed != 0)
            System.out.println("maxSpeed - " + maxSpeed);
        if(weight != 0)
            System.out.println("weight - " + weight);
    }
}
