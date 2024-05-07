public class ArrayDuplicateRemove {
    public static void main(String [] args ){
        int[] intArray={1,2,3,4,5,5,6,7,8,9,10,0,0};
        for(int i=0; i< intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i] == intArray[j]){
                    System.out.println(intArray[i]);
                    intArray[i]=-1;
                }
            }
        }
        for(int i=0; i< intArray.length; i++){
            if(intArray[i] != -1){
                System.out.println("removed array: "+intArray[i]);
            }
        }
    }
}
