import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(IntegerToRoman(58));
    }

    public static String IntToRoman(int num){
        String [] s =   {"M", "CM", "D","CD", "C","XC","L","XL","X","IX","V","IV", "I"};
        int    [] n =   {1000, 900, 500, 400, 100,  90,   50,  40,   10,  9,   5,    4, 1};
        String str = new String();
        int i=0;
        while(num>0){
            if(num>=n[i]){
                str = str + s[i];
                num = num - n[i];
            }else{
                i++;
            }
        }
        return str;
    }

    public static String IntegerToRoman(int num){
        String answer ="";
        int    [] n =   {1000, 900, 500, 400, 100,  90,   50,  40,   10,  9,   5,    4,     1};
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

        for(int i=0; i<n.length; i++){
            while (num >= n[i]){
                answer = answer + map.get(n[i]);
                num = num - n[i];
            }
        }
        return answer;
    }
}
