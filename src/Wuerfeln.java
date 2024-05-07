import java.util.Random;

public class Wuerfeln {
    public static int würfeln(){
        Random random = new Random();
        while(true){
            int i= random.nextInt(6);
            if(i == 1){
                System.out.println("eins");
            }else if(i == 2){
                System.out.println("zwei");
            }else if(i == 3){
                System.out.println("drei");
            }else if(i == 4){
                System.out.println("vier");
            }else if(i == 5){
                System.out.println("fünf");
            }else if(i == 6){
                System.out.println("sechs");
            }else{
                System.out.println("Fehler");
            }
            break;
        }
        return 0;
    }

    public static void whatsYourNammer(){
        int number = (int)(Math.random()*6+1);
        System.out.println("Welche Zahl denke ich mir zwischen 1 und 6?");

        int guess = new java.util.Scanner(System.in).nextInt();
        if(number == guess){
            System.out.println("Supper getippt!");
        }else{
            System.out.println("Tja, stimmt nicht, habe mir %s gedacht!" + " random Zahl: "+number);
        }

        System.out.println("Starte des Programm noch einmal und rate erneut!");
    }
    public static void main(String [] args){
        //würfeln();
        whatsYourNammer();
    }
}
