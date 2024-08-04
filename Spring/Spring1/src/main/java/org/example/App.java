package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1= context.getBean(Alien.class);//creates object in prototype jitna getbeans utna object
        System.out.println(obj1.getAge());
        obj1.code();

//        Dekstop dt=context.getBean(Dekstop.class);
//        dt.compile();
//
//        Dekstop dt2=context.getBean(Dekstop.class);
//        dt.compile();


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//container and creates object in singleton
//        Alien obj1=(Alien) context.getBean("Alien1");//creates object in prototype jitna getbeans utna object
//        System.out.println(obj1.getAge());
//        obj1.code();

       // Alien obj2=(Alien) context.getBean("Alien1");
        //obj2.code();
        //System.out.println(obj2.age);
//        Dekstop obj2= context.getBean("com2",Dekstop.class);
    }
}
