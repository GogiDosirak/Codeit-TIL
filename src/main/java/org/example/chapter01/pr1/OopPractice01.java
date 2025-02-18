package org.example.chapter01.pr1;

public class OopPractice01 {
    public static void main(String[] args) {
//        AbstractPayment creditCardPayment = new CreditCardPayment();
//        creditCardPayment.pay(1000);
//        creditCardPayment.cancel(500);
//
//        AccountTransferPayment accountTransferPayment = new AccountTransferPayment();
//        accountTransferPayment.pay(2000);
//        accountTransferPayment.cancel(2000);

        PersonalUser pu = new PersonalUser("u001", "CodeIt", "codeit@codeit.com");
        pu.printUserInfo();
    }

}
