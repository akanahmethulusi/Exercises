public class Bindings_Cat extends Bindings_Animal{
    void talk(){
        System.out.println("Die Katze miat..");
    }

    public static void main(String args[]){
        Bindings_Animal animal_ = new Bindings_Cat();
        animal_.talk();
    }
}
