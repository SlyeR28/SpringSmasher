package org.example.AutoWiring.EcommercePaymentSystem;

import java.util.List;

public class OderService {
   private PayementProccessor payementProccessor;
   private List<String> itemlist;

    public OderService(PayementProccessor payementProccessor) {
        this.payementProccessor = payementProccessor;
    }

    public void setItemlist(List<String> itemlist) {
        this.itemlist = itemlist;
    }
    public void placeOrder() {
        System.out.println("Placing order for: " + itemlist);
        payementProccessor.pay();
    }
}
