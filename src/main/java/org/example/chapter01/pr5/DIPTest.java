package org.example.chapter01.pr5;



public class DIPTest {
    public static void main(String[] args) {
        MapUserRepository userRepository = new MapUserRepository();
        ListUserRepository userRepository1 = new ListUserRepository();
        UserService userService = new UserService(userRepository1);
        userService.registerUser("codeit", "codeit123");
        String foundPassword = userService.findPassword("codeit");
        System.out.println(foundPassword);
    }
}
