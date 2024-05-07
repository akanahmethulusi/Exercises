public class StringLastIndexOf {
    public static void main(String[] args){
        String str;
        str = "on besinci aramayı duydum mucuk ";
        str = str.trim();
        int lastIndex = str.lastIndexOf(" ")+1;
        //System.out.println(str.substring(lastIndex, str.length()));
        System.out.println(str.length() - lastIndex);


    }
}
