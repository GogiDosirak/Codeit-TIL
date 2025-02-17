package org.example.pr4;

import java.util.HashMap;
import java.util.Map;

public class LegacyUserService {
    private final Map<String, String> userDb = new HashMap<>();

    public void register(String userId, String password) {
        userDb.put(userId, password);
    }

    public String getUserPassword(String userId) {
        return userDb.get(userId);
    }

    public boolean login(String userId, String password) {
        if (!userDb.containsKey(userId)) {
            return false;
        }
        String foundPassword = userDb.get(userId);
        return foundPassword.equals(password);
    }

    public boolean checkAdminPrivileges(String userId) {
        return "admin".equals(userId);
    }






}
