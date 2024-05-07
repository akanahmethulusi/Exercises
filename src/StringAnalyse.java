/*
Ein Programm, Beim der Nutzer ein Satz eingeben zu können. Oder fix String kann sein.
Info dann ausgeben, wie viele Gross Buchstaben enthaelt,Wie viele Kleine Buchstaben und wie viele leer zeichen?
 */
import java.util.Arrays;
public class StringAnalyse {
    public static void main(String[] args){
        String str="Eine kleine Beispiel";
     checksentez(str);

    }

    public static void checksentez(String str){
        char[] arrChar = str.toCharArray();
        String[] strWord = str.split(" ");
        int anzahlLZ = 0;
        int anzahlGB = 0;
        int anzahlKB = 0;

        int indexChar = arrChar.length;
        int indexWord = strWord.length;
        System.out.println(Arrays.toString(arrChar));
        StringBuilder strBuilder = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(arrChar[i] == ' ') {
                anzahlLZ ++;
            }
            if(Character.isUpperCase(arrChar[i])){
                anzahlGB++;
            }
            if(Character.isLowerCase(arrChar[i])){
                anzahlKB++;
            }


        }
        System.out.println("in diesem satz enthaelt:");
        System.out.println(arrChar.length+" stück Buchstaben");
        System.out.println(anzahlLZ+" stück Leer Zeichen");
        System.out.println(anzahlGB + " stück Gross Buchstaben");
        System.out.println(anzahlKB + " stück Klein Buchstaben");

    }
}
