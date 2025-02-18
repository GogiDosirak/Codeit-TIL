package org.example.chapter01.pr2;

public class Order {
    private String orderId;
    private Delivery delivery;  // Order는 Delivery를 포함(Has-A)

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void startOrderDelivery() {
        if (delivery != null) {
            delivery.startDelivery();
        } else {
            System.out.println("배송 정보가 없습니다.");
        }
    }
}
