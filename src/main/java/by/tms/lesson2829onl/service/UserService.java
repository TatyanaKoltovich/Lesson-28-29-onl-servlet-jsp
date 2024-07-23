package by.tms.lesson2829onl.service;

import by.tms.lesson2829onl.model.User;
import by.tms.lesson2829onl.storage.InMemoryUserStorage;

import java.util.Optional;

public class UserService {

   // private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    public void registerUser(User user) {

        //encript password
        //inMemoryUserStorage.save(user);
        InMemoryUserStorage.save(user);
    }

    public Optional<User> login(String username, String password) {
        //Optional<User> byUsername = inMemoryUserStorage.findByUsername(username);
        Optional<User> byUsername = InMemoryUserStorage.findByUsername(username);
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
