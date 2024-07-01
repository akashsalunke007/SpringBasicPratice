package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{
    public void drive(){
        System.out.println("Riding an Bike");
    }
}
