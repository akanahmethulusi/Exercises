public class MehrDimensional {
    public static void main(String[] args){
        MehrDimensionalSub.mehrDimensionalSub();
    }
}

class MehrDimensionalSub{
    public static void mehrDimensionalSub(){
        String[][] firstAndLastName = new String[5][2];

        firstAndLastName[0][0] = "ahmet";
        firstAndLastName[0][1] = "akan";
        firstAndLastName[1][0] = "muaz";
        firstAndLastName[1][1] = "akan";
        firstAndLastName[2][0] = "mehlika";
        firstAndLastName[2][1] = "akan";

        for(int i=0; i < firstAndLastName.length; i++){
            for(int j=0; j<firstAndLastName[i].length; j++) {
                System.out.print(firstAndLastName[i][j] + " ");
            }
            System.out.println();
        }
    }
}
