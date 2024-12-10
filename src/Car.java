import java.util.SimpleTimeZone;

public class Car {
    //Attribute/Eigenschaften
    private String color;   //Farbe
    private String brand;   //Marke
    private int horsePower; //PS-Zahl

    //Konstruktor
    public Car(String color, String brand, int horsePower){
        this.color = color;
        this.brand = brand;
        this.horsePower = horsePower;
    }

    //Konstruktor überladet
    public Car(){
        System.out.println("Auto wurde erzuegt!");
    }

    public void drive(){
        System.out.println("Das Auto faehrt......");
    }
    //Methoden überladet
    public void drive(int speed){
        System.out.println("Auto faehrt "+speed+"km/h");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}