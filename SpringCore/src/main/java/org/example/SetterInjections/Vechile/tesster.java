package org.example.SetterInjections.Vechile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class tesster {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("vechile.xml");
         Vechile v1 =   (Vechile) context.getBean("vchile1bean");
        System.out.println(v1);
    }
}
