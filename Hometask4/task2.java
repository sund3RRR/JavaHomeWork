package Hometask4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> myMap = new HashMap<>();

        ArrayList<Integer> Earth = new ArrayList<>();
        Earth.add(1233123); // adding a distance to Sun to Earth planet
        Earth.add(600000); // adding a mass to Earth planet
        Earth.add(6400); // adding a diameter to Earth planet

        myMap.put("Earth", Earth);

        ArrayList<Integer> Mercury = new ArrayList<>();
        Mercury.add(34534543); // adding a distance to Sun to Mercury planet
        Mercury.add(400000); // adding a mass to Mercury planet
        Mercury.add(3000); // adding a diameter to Mercury planet

        myMap.put("Mercury", Mercury);

        ArrayList<Integer> Venera = new ArrayList<>();
        Venera.add(23423422); // adding a distance to Sun to Venera planet
        Venera.add(500000); // adding a mass to Venera planet
        Venera.add(8000); // adding a diameter to Venera planet

        myMap.put("Venera", Venera);

        Scanner userScanner = new Scanner(System.in, "cp1251");
        while(true)
        {
            System.out.println("Enter planet name");
            try
            {
                String planetName = userScanner.next();
                ArrayList<Integer> resultPlanet = myMap.get(planetName);
                if (resultPlanet != null)
                {
                    System.out.println("Planet info:\n" + "\t Distance to sun: " + resultPlanet.get(0)
                    + "\n\t Mass: " + resultPlanet.get(1) + "\n\t Diameter: " + resultPlanet.get(2));
                }
                else
                    System.out.println("Entered invalid planet name, please retry");
                }
            catch(Exception ex)
            {
                userScanner.close();
                break;
            }       
        }
    }
}
