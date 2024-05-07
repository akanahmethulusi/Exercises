import java.util.HashMap;
import java.util.Map;

public class StringFirstNonRepeatCharacter {
    public static void  main(String[] args){
        String str  = new String("Amazon").toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        boolean status=false;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(map.get(ch) == null){
                map.put(ch, 1);
            }else{
                map.put(ch, map.get(ch)+1);
            }
        }
        for(int i=0; i< str.length(); i++){
            char ch=str.charAt(i);
            if(map.get(ch) == 1){
                System.out.println("erste non-repeat wort: " + ch);
                status = true;
                break;
            }
        }
        if(!status){
            System.out.println("kein karakter");
        }
    }
}
