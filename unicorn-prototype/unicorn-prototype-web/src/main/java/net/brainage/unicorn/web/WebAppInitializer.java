/*
 * (#) net.brainage.unicorn.web.WebAppInitializer.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import net.brainage.unicorn.web.config.AppConfig;
import net.brainage.unicorn.web.config.WebConfig;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
// public class WebAppInitializer implements WebApplicationInitializer
public class WebAppInitializer
{
    
    /**
     * logger instance by slf4j
     */
    private static final Logger log = LoggerFactory.getLogger(WebAppInitializer.class);
    
    /**
     * define dispatcher servlet name
     */
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
    
    /**
     * define dispatche servlet url mapping
     */
    private static final String DISPATCHER_SERVLET_MAPPING = "/app/*";
    
    /* (non-Javadoc)
     * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
     */
    public void onStartup(ServletContext servletContext) throws ServletException
    {
        if (log.isInfoEnabled())
        {
            log.info("+------------------------------------------------+");
            log.info("| Startup Unicorn Web Application                |");
            log.info("+------------------------------------------------+");
        }
        
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppConfig.class);
        // rootContext.refresh();
        
        // Manage the lifecycle of the root application context
        servletContext.addListener(new ContextLoaderListener(rootContext));
        
        // Create the dispatcher servlet's Spring application context
        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(WebConfig.class);
        
        // Register and map the dispatcher servlet
        ServletRegistration.Dynamic dispatcher = servletContext
                .addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping(DISPATCHER_SERVLET_MAPPING);
    }
    
}
