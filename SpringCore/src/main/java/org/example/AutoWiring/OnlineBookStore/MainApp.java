package org.example.AutoWiring.OnlineBookStore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("onilnebookstore.xml");
        BookService bS = context.getBean("service1" , BookService.class);
        System.out.println(bS);
    }
}
