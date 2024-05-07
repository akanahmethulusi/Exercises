class BindingBeispielAnimal {
    void talk(){
        System.out.println("Das Tier spricht ...");
    }
}

class BindingCat extends BindingBeispielAnimal{
    void talk(){
        System.out.println("die katze miaut..");
    }

    public static void main(String args[]){
        Bindings_Animal animal = new Bindings_Cat();
        animal.talk();
    }
}

