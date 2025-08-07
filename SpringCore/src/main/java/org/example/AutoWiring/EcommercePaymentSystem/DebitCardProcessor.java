package org.example.AutoWiring.EcommercePaymentSystem;

public class DebitCardProcessor  implements  PayementProccessor{
    @Override
    public void pay() {
        System.out.println("Payment through debit card");
    }
}
