public class ArrayTwoIndexSum {
    public static void main(String [] args){
        int[] intArray={1,3,4,5,7,8,18};
        int sum=9;

        int low=0;
        int high=intArray.length-1;

        while (low<high){
            if(intArray[low] + intArray[high]>sum){
                high--;
            } else if (intArray[low] + intArray[high]<sum) {
                low++;
            } else if (intArray[low] + intArray[high] == sum) {
                System.out.println("pair (" +intArray[low]+","+intArray[high]+")");
                low++;
                high++;
            }
        }
    }
}
