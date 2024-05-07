public class BindingBeispielCat extends BindingBeispielAnimal{
    void talk(){
        System.out.println("Die Katze spricht...");
    }

    public static void main(String args[]){
        BindingBeispielAnimal animal = new BindingBeispielCat();
        animal.talk();
    }
}
