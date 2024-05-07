public class Programm {
    public static void main(String[] args){

        /**
         *  VERERBUNG:
         *  Dog.class--Süper klass, Cat.class--Kind klass, Animals.class--Kind Klass
         */
        Dog dog = new Dog();
        dog.sleep();
        dog.setName("Platin");
        System.out.println(dog.getName());

        System.out.println("------------");

        /**
         * Methoden, Konstruktor, instanzierung,getter-setter

        Car car1 = new Car();//İnstanzierung eines Objektes
        //car1.drive(); // aufgerufene Methoden muss nicht eine statische Methoden
        car1.drive(30);//Das Method überladet
        car1.setColor("dunkle grün");
        System.out.println(car1.getColor());

        //Überladete Konstruktor angerufen
        Car car2 = new Car();
        **/
    }
}