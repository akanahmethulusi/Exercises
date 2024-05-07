public class ArrayZweiDim {
    public static void main(String[] args){
        String[][] wochenTagen = {
                {"Montag","1",":(("},
                {"Dienstag","2",":("},
                {"Mittwoch","3",":/"},
                {"Donnerstag","4",":)"},
                {"Freitag","5",":))"},
                {"Samstag","6",":)))"},
                {"Sonntag","7",":) / :("}
        };
        try {


            for (int i = 0; i < wochenTagen.length; i++) {
                //System.out.println("zeile" + i);
                for (int i1 = 0; i1 < wochenTagen[i].length; i1++) {
                    System.out.print(wochenTagen[i][i1] + " \t");
                    //System.out.println();
                }
            }
        }catch (Exception e){

        }
    }
}
