import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextdateienFileErstellen {
    public static void main(String[] args){
        createFile();
        einlesen();
    }

    public static void createFile(){
        File file = new File("TextdateienFileErstellen");
        FileWriter writer;

        try{
            writer  = new FileWriter(file);
            writer.write("1 Platin Grau 4 \n");
            writer.write("2 Minu Schwarz-Weiss 3 \n");
            writer.write("3 Saturn Weiss 5");
            writer.flush();
            writer.close();
        }catch (IOException e){
        }
    }

    public static void einlesen(){
        File file = new File("TextdateienFileErstellen");
        Scanner scanner;
        try {
            scanner  = new Scanner(file);

            while (scanner.hasNext()){
                int id = scanner.nextInt();
                String name = scanner.next();
                String farbe = scanner.next();
                int alter = scanner.nextInt();
                //for(int i=0; i<file.length(); i++){
                    System.out.println( id+".Katze info: "+ name + "  farbe: "+farbe + "  alter: "+alter);
                //}

            }
        }catch (Exception e){

        }

    }
}
