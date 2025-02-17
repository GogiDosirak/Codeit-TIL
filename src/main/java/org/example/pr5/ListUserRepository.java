package org.example.pr5;

import java.util.LinkedList;
import java.util.List;

public class ListUserRepository implements  UserRepository{
    private final List<User> userDb = new LinkedList<>();

    public void saveUser(String userId, String password) {
        userDb.add(new User(userId, password));
    }

    public String getUserPassword(String userId) {
        String found = null;
        for (User user : userDb) {
            if (user.getUserId().equals(userId)) {
                found = user.getPassword();
                break;
            }
        }
        return found;
    }

    public boolean existsUser(String userId) {
        for(User user : userDb) {
            if(user.getUserId().equals(userId)) {
                return true;
            }
        }
        return false;
    }
}
