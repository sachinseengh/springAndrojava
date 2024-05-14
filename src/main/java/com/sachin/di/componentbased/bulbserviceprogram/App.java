package com.sachin.di.componentbased.bulbserviceprogram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
  
    	
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    
        BulbService2 bulb = (BulbService2)ac.getBean("bulbService2");
        System.out.println(bulb.askBulb());
    
    }
}
