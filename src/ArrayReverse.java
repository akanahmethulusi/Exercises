public class ArrayReverse {
    public static void main(String[] args){
        int [] intArray={1,29,3,54,67,3,2};
        int i=0, j=intArray.length-1;

        for(int x=0; x< intArray.length; x++){
            System.out.print(intArray[x]+" ");
        }

        while(i<j){
            int t= intArray[i];
            intArray[i]=intArray[j];
            intArray[j] = t;
            i++;
            j--;
        }
        System.out.println();

        for(int x=0; x< intArray.length; x++){
            System.out.print(intArray[x]+" ");
        }

    }
}
