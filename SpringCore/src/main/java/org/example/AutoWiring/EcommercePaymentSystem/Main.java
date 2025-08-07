package org.example.AutoWiring.EcommercePaymentSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("order.xml");
        OderService oderService = context.getBean("oderService" , OderService.class);
        oderService.placeOrder();
        NotificationService ns = context.getBean("notificationService" , NotificationService.class);
    }
}
