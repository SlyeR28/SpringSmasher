package org.example.AutoWiring.EmpAdress;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    private Address address;

    public void setAddress(Address address) {
        System.out.println("setAddress() called");
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }


}
