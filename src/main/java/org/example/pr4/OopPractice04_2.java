package org.example.pr4;

public class OopPractice04_2 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        userService.registerUser("codeit", "codeit123");
        String foundPassword = userService.findPassword("codeit");
        System.out.println(foundPassword);

        AuthService authService = new AuthService(userRepository);
        boolean authenticated = authService.login("codeit", "codeit123");
        System.out.println(authenticated);

    }
}
