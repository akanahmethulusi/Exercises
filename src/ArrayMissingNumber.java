public class ArrayMissingNumber {
    public static void main(String [] args){

        int[] intArray = {1,2,3,4,5,7,8,9,10};
        int n = intArray.length + 1;
        int sum = (n*(n+1))/2;

        for(int i=0; i<intArray.length; i++){
            sum = sum - intArray[i];
        }
        System.out.println("Missing number is "+sum);
    }
}
