package org.example.ConstructorInjections.EcommerceOrderMang;

import java.util.List;

public class Order {
    private String orderId;
    private List<Product> productList;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Order(Customer customer, String orderId, List<Product> productList) {
        this.customer = customer;
        this.orderId = orderId;
        this.productList = productList;
    }
    
}
