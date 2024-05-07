import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringDuplicateChar {
    public static void main(String [] srgs){
        String str = new String("Meine Name ist Junny");
        char[] toChar = str.toCharArray();
        int count;
        System.out.println(Arrays.toString(toChar));
        for(int i=0; i<toChar.length; i++){
            count=1;
            for(int j=i+1; j< toChar.length; j++){
                if(toChar[i] == toChar[j] && toChar[j] !=' '){
                    count++;
                    toChar[j] = '0';
                }
            }
            if(count>1 && toChar[i] != '0'){
                System.out.print(toChar[i]+" ");
            }
        }
    }
}
