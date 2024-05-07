public class SingleTon {
    public static void main(String[] args){
        King king = King.getInstance();
        king.setName("Heinrich");
        System.out.println(king.angriffBefehl());
    }
}

class King{
    String name;
    private static King unsereKoenig;

    private King(){
    }

    public static King getInstance(){
        if(unsereKoenig == null){
            unsereKoenig = new King();
        }
        return unsereKoenig;
    }

    public void setName(String koenig){
        name = koenig;
    }
    public String angriffBefehl(){
        return name+ " befielt: Wir greifen an";
    }

    public String rueckzugBefell(){
        return name+" befielt: Wir ziehen uns zurück";
    }
}
