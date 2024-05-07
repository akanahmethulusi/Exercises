public class Methoden {
    public static void main(String[] args){
        System.out.println("Vor dem Methodenaufruf!");
        doSomething();
        System.out.println("Nach dem Methodenaufruf!");
    }

    public static void doSomething(){
        int a=5;
        int b=8;
        int result= a*b;
        System.out.println(result);
    }
}
