package HomeTask2;

public class task3 {
    
}

class Animals{
    public String legs;
    public String color;
    public String weight;
    Animals()
    {
        legs = "";
        color = "";
        weight = "";
    }
    public void Voice()
    {
        System.out.println("Voice!");
    }
    public void Eat()
    {
        System.out.println("Nyam-nyam!");
    }
}
class Mammals extends Animals{
    @Override
    public void Eat()
    {
        System.out.println("Mmmmm!");
    }
}
class Birds extends Animals{
    @Override
    public void Eat()
    {
        System.out.println("Das is gud!");
    }
}
class Cat extends Mammals{
    @Override
    public void Voice(){
        System.out.println("Myau!");
    }
}
class Dog extends Mammals{
    @Override
    public void Voice(){
        System.out.println("Gav!");
    }
}