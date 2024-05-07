import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Business> businesses = new ArrayList<>();
        //mach zuerst für Business Classe neue Objekt erstellen ->Signatur(String name, ArrayList<Person> employees)
        businesses.add(new Business("Google", new ArrayList<>(){{
            //
            add(new Person("Heinrich" , 22));
            add(new Person("Friedrich", 29));
            add(new Person("Ludwig", 33));
        }}));
        businesses.add(new Business("Apple", new ArrayList<>(){{
            add(new Person("Hurry", 45));
            add(new Person("Sally", 38));
            add(new Person("Dani", 28));
        }}));
        businesses.add(new Business("Amazon", new ArrayList<>(){{
            add(new Person("Kelly", 33));
            add(new Person("Tina", 41));
            add(new Person("Fink", 45));
            add(new Person("Julia", 22));
        }}));


        String groesse = businesses.stream()
                .flatMap(b->b.getEmployees().stream())
                .map(p->p.getName())
                .sorted()
                        .collect(Collectors.joining("\t" +
                                " "));
        System.out.println(groesse);
        /*
        b->b heisst;
        for(Businesses b: businesses)
         */

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class Business{
    String name;
    ArrayList<Person> employees;

    public Business(String name, ArrayList<Person> employees){
        this.name = name;
        this.employees = employees;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public ArrayList<Person> getEmployees(){
        return employees;
    }

    public void setEmployees(ArrayList<Person> employees){
        this.employees = employees;
    }
}