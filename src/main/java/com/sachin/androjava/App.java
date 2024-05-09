package com.sachin.androjava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sachin/androjava/Config.xml");
   
    BulbService2 bs=(BulbService2) context.getBean("service");
    System.out.print(bs.askBulb());
    
    
    
    
    }
}
