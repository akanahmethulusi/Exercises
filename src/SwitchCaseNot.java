/*
Ein Programm soll schreiben, dass dir von mehreren Noten dem durchschnitt ausgibt.
Das heisst du, startest du das Programm und gibt es nach und nach deine Noten
einen Text vermeiden. Das heisst du, schreibst du zum Beispiel 1 nichts
Das ganze mit einem scanner ein Speicher ist ihr das in einer Variable und
diese Variable soll dann durch so einen switch getestet werden und
entsprechend der Note kannst du dann durch diese einzelnen Case ist
ein Notendurchschnitt veraendern.
 */


import java.util.Scanner;

public class SwitchCaseNot {
    public static void main(String[] args){
        Note1.notBerechnung();
    }
}

class Note1 {
    public static void notBerechnung(){
        double counter = 0;  //Anzahl an eingegebenen Noten
        int sum = 0;  // Summe der Noten
        boolean weiter=true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte gebe deine Note in Textform (Eins, Zwei, Drei, Vier, Fünf oder Sechs) ein!");
        System.out.println("Bitte beachte die Groß und Kleinschreibung!");
        System.out.println("Wenn du alle Noten eingegeben hast, gebe Berechne ein!");

        while(weiter) {
            String eingabe = scan.nextLine();
            counter++;

            switch (eingabe) {
                case "Eins":
                    sum++;
                    break;

                case "Zwei":
                    sum += 2;
                    break;

                case "Drei":
                    sum += 3;
                    break;

                case "Vier":
                    sum += 4;
                    break;

                case "Fünf":
                    sum += 5;
                    break;

                case "Sechs":
                    sum += 6;
                    break;

                case "Berechne":
                    counter --;
                    weiter=false;
                    break;
                default:
                    counter --;
                    System.out.println("Das ist ist keine Note!!!" );
                    System.out.println("Bitte gebe Eins, Zwei, Drei, Vier, Fünf, Sechs oder Berechne ein!");
            }
        }
        double durchschnitt = sum/counter;
        System.out.println("Die Summe deiner Noten beträgt: " + Math.round(sum));
        System.out.println("Du hast " + Math.round(counter) + " Noten eingegeben");
        System.out.println("Dein Notenschnitt beträgt: " + durchschnitt);

        if (durchschnitt <= 2.5) {
            System.out.println("Gutes Ergebnis!");
        }
        else if (durchschnitt <= 3.5) {
            System.out.println("Ergebnis ist in Ordnung!");
        }
        else if (durchschnitt <= 5) {
            System.out.println("Schwaches Ergebnis!");
        }
        else {
            System.out.println("Sehr schlechtes Ergebnis! Du bist Sitzen geblieben!!!");
        }
    }
}
