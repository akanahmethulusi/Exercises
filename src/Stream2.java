import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Business2> businesses2 = new ArrayList<>();
        businesses2.add(new Business2("Amazon", new ArrayList<>(){{
            add(new Person2("Clara" , 48));
            add(new Person2("Hemi",41));
            add(new Person2("julie", 13));
        }}));

        businesses2.add(new Business2("Tesla", new ArrayList<>(){{
            add(new Person2("Hamdi" , 48));
            add(new Person2("Hemdie",40));
            add(new Person2("Ada", 23));
        }}));

        businesses2.add(new Business2("Apple", new ArrayList<>(){{
            add(new Person2("Hanna" , 12));
            add(new Person2("Menna",38));
            add(new Person2("Kenna", 15));
        }}));

        String str = businesses2.stream()
                .flatMap(b->b.getEmployees2().stream())
                .filter(p->p.getAge() > 30)
                .map(p->p.getName())
                .sorted()
                .collect(Collectors.joining("\t" + " "));
        System.out.println(str);
    }
}

class Person2{
    String name;
    int age;

    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Business2{
    String name;
    ArrayList<Person2> employees2;

    public Business2(String name, ArrayList<Person2> employees2) {
        this.name = name;
        this.employees2 = employees2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person2> getEmployees2() {
        return employees2;
    }

    public void setEmployees2(ArrayList<Person2> employees2) {
        this.employees2 = employees2;
    }
}