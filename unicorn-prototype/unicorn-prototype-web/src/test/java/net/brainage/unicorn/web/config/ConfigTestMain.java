/*
 * (#) net.brainage.unicorn.web.config.ConfigTestMain.java
 * Created on 2012. 1. 17.
 */
package net.brainage.unicorn.web.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
public class ConfigTestMain
{
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
    }
    
}
