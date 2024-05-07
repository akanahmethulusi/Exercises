import java.util.Random;

/*
switch(variable){
    case wert1:
        code
    case wert2:
        code
    case wert3:
        code
    default:
}

 */
public class SwitchCase {
    public static void main(String [] args){
        Random random = new Random();
        int wuerfel=random.nextInt(6)+1;
        String ergebnis ="";
        switch(wuerfel){
            case 1:
                ergebnis="Eins :((";
                break;
            case 2:
                ergebnis="Zwei :(";
                break;
            case 3:
                ergebnis ="drei :/";
                break;
            case 4:
                ergebnis = "vier :)";
                break;
            case 5:
                ergebnis ="fünf :))";
                break;
            case 6:
                ergebnis ="sechs :)))";
                break;
            //default:
                //System.out.println("Falsche eingabe");
        }
        System.out.println(ergebnis);
    }
}
