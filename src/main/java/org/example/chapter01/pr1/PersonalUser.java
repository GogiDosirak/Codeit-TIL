package org.example.chapter01.pr1;

public class PersonalUser extends User
{
    private String personalEmail;

    public PersonalUser(String userId, String name, String personalEmail) {
        super(userId,name);
        this.personalEmail = personalEmail;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo(); // 안해도됨
        System.out.println("개인 이메일: " + personalEmail);
    }
}
