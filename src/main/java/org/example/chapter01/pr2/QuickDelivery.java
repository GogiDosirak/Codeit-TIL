package org.example.chapter01.pr2;

public class QuickDelivery implements Delivery{
    @Override
    public void startDelivery() {
        System.out.println("해외 배송");
    }
}
