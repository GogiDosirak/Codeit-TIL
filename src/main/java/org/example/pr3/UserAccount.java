package org.example.pr3;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        if(accountId == null || accountId.isEmpty()) {
            throw new IllegalArgumentException("유효하지 않은 계좌 ID입니다.");
        }
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금 금액은 0보다 커야합니다.");
        }
        balance += amount;
        System.out.println("계좌 [" + accountId + "]에 " + amount + "원 입금.");
        System.out.println("현재 잔액 : " + balance + "원");
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        }
        if(balance - amount < 0) {
            throw new IllegalArgumentException("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
        balance -= amount;
        System.out.println("계좌 [" + accountId + "]에 " + amount + "원 출금.");
        System.out.println("현재 잔액 : " + balance + "원");
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }





}
