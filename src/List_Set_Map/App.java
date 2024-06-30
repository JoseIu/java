package List_Set_Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        List<User> numbers = new ArrayList<User>();

        for (int i = 0; i < 20; i++) {
            boolean isAcive = i %2 == 0;
            User user= new User("Paco",i, isAcive);
            numbers.add(user);
        }

        System.out.println(numbers);

        User userToEdit = numbers.get(0);

        userToEdit.setName("Jose");
        System.out.println(numbers);

        System.out.println("--------SETS-------");
        Set<User> users2 = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            boolean isAcive = i %2 == 0;
            User user2= new User("Paco",i, isAcive);
            users2.add(user2);
        }

        System.out.println(users2.size());
    }
}
