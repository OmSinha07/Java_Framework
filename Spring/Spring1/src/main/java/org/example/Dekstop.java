package org.example;

import org.springframework.stereotype.Component;

@Component("com2")
public class Dekstop implements Computer{
    public Dekstop() {
        System.out.println("Dekstop object created");
    }

    public void compile()
    {
        System.out.println("Compiling with Dekstop");
    }

}
