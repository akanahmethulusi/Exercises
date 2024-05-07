/*
in File Textdateien auslesen
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextdateienFileEinlesen {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("//Users/muazakan/eclipse-workspace/Aufgabe19_Bibliothek_14923_*****/readMe");
        Scanner scan;


        try {
            scan = new Scanner(file);
            //for(int i=0; i<file.length(); i++) {
                //if (file.isFile()) {
                while (scan.hasNext()){
                    System.out.println("\t" +scan.nextLine());
                    char[] arrChar = scan.nextLine().toCharArray();
                    //System.out.println(Arrays.toString(scan.nextLine().toCharArray()));

                }
            //}
        }catch (Exception e){
            System.out.println();
        }


    }
}
