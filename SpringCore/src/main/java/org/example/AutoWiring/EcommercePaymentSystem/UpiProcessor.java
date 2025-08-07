package org.example.AutoWiring.EcommercePaymentSystem;

public class UpiProcessor implements PayementProccessor {
    @Override
    public void pay() {
        System.out.println("payment via Upi ");
    }
}
