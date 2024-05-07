import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDuplicateFind {
    public static void main(String[] srgs){
        int[] intArray={1,2,2,3,4,5,10,6,7,8,9,10};

        for(int i=0; i< intArray.length-1; i++){
            for(int j=i+1;  j<intArray.length; j++){
                if(intArray[i] == intArray[j]){
                    if(intArray[i] != 0) {

                            System.out.println("Duplicate element : " + intArray[i] + "\t");

                    }




                }
            }
        }
    }
}
