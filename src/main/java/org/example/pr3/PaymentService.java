package org.example.pr3;

public class PaymentService {

    public void processPayment(UserAccount account, double amount) {
        // 잔고 관련 로직은 UserAccount에서 담당하므로,
        // 여기선 try catch로 결제 관련 처리 로직 (IllegalArgumentException이 터지면 다른 처리 로직 발생)
        try {
            account.withdraw(amount);
        } catch(IllegalArgumentException e) {
            // 다른 처리 로직
            throw new RuntimeException(e);
        }

        System.out.println("결제 서비스: 계좌 [" + account.getAccountId() + "]에 대해 " + amount + "원 결제 완료.");
    }

    public void processRefund(UserAccount account, double amount) {
        try {
            account.deposit(amount);
        } catch (IllegalArgumentException e) {
            // 다른 처리 로직
            throw new RuntimeException(e);
        }

    }
}
