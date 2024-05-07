import java.util.Arrays;

public class Generics {

    public static void main(String[] srgs){
        Integer [] intArr = {1,2,3,45,16,7};
        String[] strArr = {"C,H,A,R"};
        Character[] charArr ={'a','b','c','e'};
        //auslesen(charArr);
        //auslesen(intArr);

        auslesen(strArr);
    }

    public static  <Type> void auslesen(Type[] arrType){
        for (Type type : arrType) {
            System.out.print(type+" \t");
        }

    }
}

