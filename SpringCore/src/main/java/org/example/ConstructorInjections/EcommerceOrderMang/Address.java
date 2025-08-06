package org.example.ConstructorInjections.EcommerceOrderMang;

public class Address {
    private String city;
    private String state;
    private int pinCode;

    public Address(String city, int pinCode, String state) {
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getState() {
        return state;
    }
}
