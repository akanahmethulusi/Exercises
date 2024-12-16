public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x){
        if(x<0){
            return  false;
        }

        long reserved = 0;
        long temp = x;

        while(temp != 0){                   //bis x Eingabezahl wert Null ist
            int digit = (int)temp%10;       //die letzte Ziffern extrahiert
            reserved = reserved*10 + digit; // um die Zahl umzukehren
            temp = temp / 10;               //um die letzte Ziffern zu entfernen
        }
        return (reserved == x);
    }
}
