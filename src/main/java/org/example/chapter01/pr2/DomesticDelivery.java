package org.example.chapter01.pr2;

public class DomesticDelivery implements Delivery{
    @Override
    public void startDelivery() {
        System.out.println("국내 배송");
    }
}
