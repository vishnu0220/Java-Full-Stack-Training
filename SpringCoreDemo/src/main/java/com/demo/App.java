package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // IOC Container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // Fetching Bean
        Student student1 =
                (Student) context.getBean("studentBean");

        System.out.println(student1.display());

        System.out.println("--------------------------------");

        Student student2 =
                (Student) context.getBean("studentBean");

        System.out.println(student2.display());

        // Prototype Scope Verification
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
