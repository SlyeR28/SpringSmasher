package org.example.AutoWiring.LibraryMangement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainnapp {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("library.xml");
       Library library = context.getBean("library" , Library.class);
         library.mamngeLibrary();
    }
}
