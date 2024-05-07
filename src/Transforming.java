public class Transforming {
    public int a;

    public int transform(int a){
        return a*4+3;
    }

    public static void main(String[] args) {
        Transforming trans = new Transforming();
        trans.a = trans.transform(7);
        trans.a = trans.transform(trans.a);
        System.out.println(" Transform a: "+trans.a);
    }
}
