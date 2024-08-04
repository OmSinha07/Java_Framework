package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Dekstop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean
//    public Alien alien(Computer com)//autowire,@Qualifier("laptop")
//    {
//        Alien obj1=new Alien();
//        obj1.setAge(25);
//        obj1.setCom(com);
//        return obj1;
//    }
//
////    @Bean(name = {"com2","beast"})
//    @Bean
//
//  public Dekstop dekstop()
//  {
//      return new Dekstop();
//  }
//  @Primary
//  @Bean
//    public Laptop laptop()
//    {
//        return new Laptop();
//    }

}
