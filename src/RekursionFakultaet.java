public class RekursionFakultaet {
    public static void main(String[] args){
        System.out.println(Fakultaet.fakultaet(5));
    }
}

class Fakultaet{
    public static int fakultaet(int zahl){
        if(zahl == 1){
            return 1;
        }else{
            return zahl * fakultaet(zahl-1);
        }
    }
}
