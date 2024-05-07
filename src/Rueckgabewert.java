public class Rueckgabewert {
    public static void main(String[] args) {
        System.out.println("Vor dem Methodenaufruf!");
        int resultMethodenDoSomething = RueckgabewertSub.doSomething( 5, 9);
        System.out.println(resultMethodenDoSomething);
        System.out.println("Nach dem Methodenaufruf!");
    }
}

class RueckgabewertSub{
    public static int doSomething(int a, int b) {
        return a * b;
    }
}