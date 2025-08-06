package org.example.ConstructorInjections.EcommerceOrderMang;

public class Customer {
    private String name;
    private Address address;

    public Customer(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
