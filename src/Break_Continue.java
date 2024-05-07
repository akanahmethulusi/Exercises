import java.util.Arrays;

public class Break_Continue {
    public static int beispielContinue(){
        int [] intArray={238,343,23,1,56,778,900,34};
        int sum = 0;

        for (int i: intArray){
            if(i <=  100){
                //if listed when big 100
                continue;
            }
            //print all big 100
            System.out.println(i);
            sum=sum+i;
        }
        return 0;
    }

    public static int beispielContinue2(){
        for (int i = 0; i < 12; i++) {
            if(i == 5){
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
        return 0;
    }

    public static String beispielContinue3(){
        String[] strings = new String[5];
        strings[0] = "Hey!";
        strings[2] = "ohne Abstand";
        strings[3] = "bitte!";

        for (String string : strings) {
            if(string == null){
                continue;
            }
            System.out.println(string);
        }
        return null;
    }

    public static void main(String [] args){
        beispielContinue();
    }
}
