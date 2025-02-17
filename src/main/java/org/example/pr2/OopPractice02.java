package org.example.pr2;

public class OopPractice02 {
    public static void main(String[] args) {
        DomesticDelivery delivery = new DomesticDelivery();
        Order order = new Order("o001");
        order.setDelivery(delivery);
        order.startOrderDelivery();

        QuickDelivery quickDelivery = new QuickDelivery();
        Order order2 = new Order("o002");
        order2.setDelivery(quickDelivery);
        order2.startOrderDelivery();
    }
}