/*
Alle Zahlen von 1 bis 100  ausgeben.
Dabei;
*für Zahlen, die das Produkt aus 3 und 5 sind , ausgaben "FizzBuzz"
*für Zahlen, die das Produkt aus 3 sind, ausgaben "Fizz"
*für Zahlen, die das Produkt aus 5 sind, ausgaben "Buzz"
 */

public class FrageZahlenFizzBuzz {
    public static void fizzbuzz(){
        for(int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3 ==0){
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args){
        fizzbuzz();
    }
}






