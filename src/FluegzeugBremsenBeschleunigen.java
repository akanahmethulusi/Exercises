/*
Es gibt 2 Flugtypen: Airbus und Jet.
Airbus maximum Geschwindigkeit : 840;
Jet maximum Geschwindigkeit: 3529

Programmiere eine Steuerung für die Flugzeuge.
Es sind zwei Steuerungsmöglichkeiten gegeben: Bremsen und beschleunigen.
ist die maximum Geschwidigkeit erreicht, dann Meldung ausgeben.
 */
class FlugzeugBremsenBeschleunigen{
    public static void main(String[] args){
        Flugzeug airbus = new Flugzeug("Airbus", 840);
        Flugzeug jet = new Flugzeug("Jet", 3529);

        airbus.beschleunigen(300);
        jet.beschleunigen(4000);

        airbus.bremsen(200);
        jet.bremsen(100);
    }
}

class Flugzeug{
    String typ;
    int maxGeschwindigkeit;
    int aktuellGeschwindigkeit;

    public Flugzeug(String typ, int maxGeschwindigkeit){
        this.typ = typ;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.aktuellGeschwindigkeit =0;
    }

    public void beschleunigen(int geschwindigkeitZuwachs){
        aktuellGeschwindigkeit+= geschwindigkeitZuwachs;
        if(aktuellGeschwindigkeit > maxGeschwindigkeit){
            System.out.println("Max geschwindigkeit erreicht für " + typ +" : " +maxGeschwindigkeit);
            aktuellGeschwindigkeit = maxGeschwindigkeit;
        }else {
            System.out.println(typ +" beschleunigt für "+ aktuellGeschwindigkeit + " km/h");
        }
    }

    public void bremsen(int geschwindigkeitAbnahme){
        aktuellGeschwindigkeit-=geschwindigkeitAbnahme;
        if(aktuellGeschwindigkeit < 0){
            aktuellGeschwindigkeit = 0;
        }
        System.out.println(typ + " bremsen "  + aktuellGeschwindigkeit + " km/h");
    }

    public int getAktuellGeschwindigkeit(){
        return aktuellGeschwindigkeit;
    }
}
