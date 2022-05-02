package activities;

public class Car {
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    //constructor
    Car() {
        tyres = 4;
        doors = 4;
    }
    public void displayCharecteristics()
    {
System.out.println("Color of the car: " + color);
System.out.println("Make of car: " + make);
System.out.println("Transmission of car" + transmission);
    }
public void accelerate()
{
    System.out.println("Car is moving forward");
}
public void brake()
{
    System.out.println("Car has stopped");
}
}
