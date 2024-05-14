import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _LeetCodeTest {
    public static void main(String[] args) {
        User me = new User();
        me.setVorname("Otto");
        me.setNachname("Khan");

        User you = new User();
        you.setVorname("Meriam");
        you.setNachname("Weissberg");

        List<User> users = new ArrayList<>();

        User found = User.findUser(users, you);
        System.out.println(found);
    }
}

class User{
    String vorname;
    String nachname;

    public User(){

    }
    public User(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public static User findUser(List<User> users, User u){
        for(User user: users){
            System.out.println(u);
            if(user.equals(u)){

                return user;
            }
        }
        return null;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
