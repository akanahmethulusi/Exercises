public class ArrayMinMaxNumber {

    public ArrayMinMaxNumber(){
        int[] zahl={3,6,10,5,99,33,-21,65,3,4,6,55};
        int min= zahl[0];
        int max= zahl[0];

        for(int i=0; i< zahl.length; i++){
            if(zahl[i] > max){
                max = zahl[i];
            }
            if(zahl[i]<min){
                min = zahl[i];
            }
        }
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);

    }


    public static void main(String [] args){
        new ArrayMinMaxNumber();
    }
}
