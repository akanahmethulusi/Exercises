import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args){
        String str1= new String("LIVES").toLowerCase().replaceAll("\\s+","");
        String str2= new String("Elvis").toLowerCase().replaceAll("\\s+","");
        //String am1 = str1.toLowerCase().replaceAll("\\s+","");
        //String am2 = str2.toLowerCase().replaceAll("\\s+","");

        if(str1.length() != str2.length()){
            System.out.println("das ist keine amagram wort");
        }else{
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            Arrays.equals(ch1, ch2);

            System.out.println("1.: "+ Arrays.toString(str1.toCharArray()));
            System.out.println("2.: "+ Arrays.toString(ch2));
        }
    }
}
