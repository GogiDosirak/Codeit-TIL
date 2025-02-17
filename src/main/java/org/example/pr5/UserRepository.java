package org.example.pr5;

public interface UserRepository {
    public void saveUser(String userId, String password);

    public String getUserPassword(String userId);

    public boolean existsUser(String userId);
}
