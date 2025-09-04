package com.example.SpringANO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext fac = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung a1 = fac.getBean(Samsung.class);
        a1.config();
    }
}
