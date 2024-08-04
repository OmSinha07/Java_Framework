package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;
@Component
public class Alien {
    @Value("25")
   private int age;
   @Autowired

   private Computer com;
    public Alien()
    {
        System.out.println("Alien Object created");
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age,Computer lap) {
//        this.age = age;
//        this.lap=lap;
//    }

    public int getAge() {
        return age;
    }

   public void setAge(int age) {//setter injection
//        System.out.println("Setter method");
        this.age = age;
  }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("Coding...");
        com.compile();
    }

}
