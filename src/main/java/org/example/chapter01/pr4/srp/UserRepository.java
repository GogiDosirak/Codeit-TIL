package org.example.chapter01.pr4.srp;

import java.util.HashMap;
import java.util.Map;

// 실제 데이터를 저장하고 불러오는 것만 담당
public class UserRepository {
    private final Map<String, String> userDb = new HashMap<>();

    public void saveUser(String userId, String password) {
        userDb.put(userId, password);
    }

    public String getUserPassword(String userId) {
        return userDb.get(userId);
    }

    public boolean existsUser(String userId) {
        return userDb.containsKey(userId);
    }

}
