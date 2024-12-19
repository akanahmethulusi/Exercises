public class TwoSumIndices {
    public static void main(String[] args) {
        int[] num={2,7,9,4,2,};
        int target=13;
        twoSum(num,target);
    }

    public static int[] twoSum(int [] sum, int target){

        for(int i=0; i<sum.length; i++){
            for (int j = i+1; j<sum.length; j++){
                if(sum[i] + sum[j] == target){
                    System.out.println(i+".indices: "+sum[i] + "\n"+j+".indices: "+sum[j]);
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
