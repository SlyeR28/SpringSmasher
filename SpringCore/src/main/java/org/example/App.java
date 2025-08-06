package org.example;

import org.example.ConstructorInjections.EcommerceOrderMang.ECommercePlatform;
import org.example.SetterInjections.UniversityCourse.University;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("order.xml");
        ECommercePlatform ec1 = (ECommercePlatform) context.getBean("ecormeceplatform3");
        ec1.displayOrders();

    }
}
