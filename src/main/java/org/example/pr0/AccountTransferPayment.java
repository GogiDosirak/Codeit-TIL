package org.example.pr0;

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        validatePayAmount(amount);
        System.out.println("계좌이체로 " + amount + "원 결제합니다.");
    }

    @Override
    public void cancel(double amount) {
        validateCancelAmount(amount);
        System.out.println("계좌이체로 " + amount + "원 취소합니다.");
    }
}

