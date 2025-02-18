package org.example.chapter01.pr3;

public class OopPractice03 {

   private static PaymentService paymentService = new PaymentService();

    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("Account 001");
        userAccount.deposit(10000);

        paymentService.processPayment(userAccount,5000);
        paymentService.processRefund(userAccount, 2000);
    }

}
