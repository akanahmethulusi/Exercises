public class MehrDimensional {
    public static void main(String[] args){
        MehrDimensionalSub.mehrDimensionalSub();
    }
}

class MehrDimensionalSub{
    public static void mehrDimensionalSub(){
        String[][] firstAndLastName = new String[5][2];

        firstAndLastName[0][0] = "Hannes";
        firstAndLastName[0][1] = "Klemen";
        firstAndLastName[1][0] = "Otto";
        firstAndLastName[1][1] = "Bukelemen";
        firstAndLastName[2][0] = "Henrich";
        firstAndLastName[2][1] = "Stamm";

        for(int i=0; i < firstAndLastName.length; i++){
            for(int j=0; j<firstAndLastName[i].length; j++) {
                System.out.print(firstAndLastName[i][j] + " ");
            }
            System.out.println();
        }
    }
}
