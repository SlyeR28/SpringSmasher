package org.example;

import org.example.SetterInjections.UniversityCourse.University;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("University.xml");
        University uni1  = (University) context.getBean("university1");
        uni1.display();
    }
}
