package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Autowired
    private Vehicle tyre;

    public void drive(){
        System.out.println("Driving a car with ");
        tyre.drive();
    }
}
