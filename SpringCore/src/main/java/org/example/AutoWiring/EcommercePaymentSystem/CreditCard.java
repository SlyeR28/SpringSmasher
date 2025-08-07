package org.example.AutoWiring.EcommercePaymentSystem;

public class CreditCard implements PayementProccessor {
    @Override
    public void pay() {
        System.out.println("Payment by credit card");
    }
}
