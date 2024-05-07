/*
Eine String Message erstellt.
um zukontrollieren, Mit welche buchstaben beginnt, benutzt if-Anweisung.

 */

public class KonditionelleOperatoren {
    public static void main(String[] args ){
        String message = "Hallo Leute, wie geht's!";
        int lange = message.length();
        if(message.startsWith("Hallo")){
            System.out.println("Hey");
            //Methode 1
        }else{
            System.out.println("Echt?");
            //Methode2
        }

        // boolean (Bedingung) ? (wahre) : (false)
        // if(message.equals("Hallo Leute wie gehts")) welcome=true;
        String response = message.startsWith("Hallo") ? upper("Hey") : "Du";
        System.out.println(response);

        String response2 = lange > 24 ? ("Lange Satz") : lange == 24 ? upper("Mittel Satz") : ("Nicht Lange Satz");
        System.out.println(response2);

        System.out.println(Taschenrechner.abs(-98));

    }
    public static String upper(String response){
        return response.toUpperCase();
    }
}
