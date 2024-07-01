package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);

        Car obj = (Car)context.getBean("car");
        obj.drive();

//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t.toString());
    }
}