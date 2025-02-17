package org.example.pr4;

public class OopPractice04 {
    public static void main(String[] args) {
        LegacyUserService userService = new LegacyUserService();
        userService.register("codeit", "codeit123");
        userService.register("codeit2", "codeit123!!");
        userService.register("admin", "admin@@1234");

//        String adminPassword = userService.getUserPassword("admin");
//        System.out.println("Admin pw: " + adminPassword);

        String somePassword = userService.getUserPassword("codeit3");
        System.out.println("Some pw: " + somePassword);

        boolean noUserLogin = userService.login("codeit3", "codeit123");
        System.out.println("Login result 0: " + noUserLogin);

        boolean codeitLogin = userService.login("codeit", "codeit123");
        System.out.println("Login result 1: " + codeitLogin);

        boolean codeit2Login = userService.login("codeit2", "codeit123");
        System.out.println("Login result 2: " + codeit2Login);

    }
}
