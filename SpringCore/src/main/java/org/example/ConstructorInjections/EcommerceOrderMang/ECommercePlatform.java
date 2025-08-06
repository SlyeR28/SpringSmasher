package org.example.ConstructorInjections.EcommerceOrderMang;

import java.util.Map;

public class ECommercePlatform {
    private Map<String , Order> orders;

    public ECommercePlatform(Map<String, Order> orders) {
        this.orders = orders;
    }


    public void displayOrders() {
        for (Map.Entry<String, Order> entry : orders.entrySet()) {
            Order order = entry.getValue();
            System.out.println("Order ID: " + entry.getKey());
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("City: " + order.getCustomer().getAddress().getCity());
            System.out.println("Products:");
            for (Product p : order.getProductList()) {
                System.out.println(" - " + p.getName() + " ($" + p.getPrice() + ")");
            }
            System.out.println("----");
        }
    }
 }
