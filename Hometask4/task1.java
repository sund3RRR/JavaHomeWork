package Hometask4;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Planet {
    private Integer distanceToSun;
    private Integer mass;
    private Integer diameter;

    Planet(Integer dTS, Integer m, Integer d)
    {
        this.distanceToSun = dTS;
        this.mass = m;
        this.diameter = d;
    }

    void setDistanceToSun(Integer dTS)
    {
        this.distanceToSun = dTS;
    }
    void setMass(Integer m)
    {
        this.mass = m;
    }
    void setDiameter(Integer d)
    {
        this.diameter = d;
    }
    Integer getDistanceToSun()
    {
        return this.distanceToSun;
    }
    Integer getMass()
    {
        return this.mass;
    }
    Integer getDiameter()
    {
        return this.diameter;
    }
}
public class task1 {
    public static void main(String[] args) {     
        Map<String, Planet> myMap = new HashMap<>();

        Planet Earth = new Planet(1233123, 600000, 6400);
        Planet Mercury = new Planet(34534543, 400000, 3000);
        Planet Venera = new Planet(23423422, 500000, 8000);
        myMap.put("Earth", Earth);
        myMap.put("Mercury", Mercury);
        myMap.put("Venera", Venera);

        Scanner userScanner = new Scanner(System.in, "cp1251");
        while(true)
        {
            System.out.println("Enter planet name");
            try
            {
                String planetName = userScanner.next();
                Planet resultPlanet = myMap.get(planetName);
                if (resultPlanet != null)
                {
                    System.out.println("Planet info:\n" + "\t Distance to sun: " + resultPlanet.getDistanceToSun()
                    + "\n\t Mass: " + resultPlanet.getMass() + "\n\t Diameter: " + resultPlanet.getDiameter());
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
