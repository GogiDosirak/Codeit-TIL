package org.example.pr0;

public class CreditCardPayment extends AbstractPayment{

    @Override
    public void pay(double amount) {
        validatePayAmount(amount);
        System.out.println("신용카드로 " + amount + "원 결제합니다.");
    }

    @Override
    public void cancel(double amount) {
        validateCancelAmount(amount);
        System.out.println("신용카드로 " + amount + "원 취소합니다.");
    }
}
