package by.tms.lesson2829onl.storage;

import by.tms.lesson2829onl.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class InMemoryUserStorage {
    private static List<User> users = new ArrayList<User>();

    public static void save(User user) {
        users.add(user);
    }

     public static Optional<User> findByUsername(String username) {
         //return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElse(null);
         for (User user : users) {
             if (user.getUsername().equals(username)) {
                 return Optional.of(user);
             }
         }
         return Optional.empty();
     }
}
