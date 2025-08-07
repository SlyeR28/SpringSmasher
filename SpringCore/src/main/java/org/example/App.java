package org.example;

import org.example.AutoWiring.EmpAdress.Employee;
import org.example.ConstructorInjections.EcommerceOrderMang.ECommercePlatform;
import org.example.SetterInjections.UniversityCourse.University;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    ApplicationContext  context =  new ClassPathXmlApplicationContext("Employe.xml");
       Employee emp1 =  context.getBean("Empoye1" , Employee.class);
        System.out.println(emp1.toString());


    }
}
