/*
 * (#) net.brainage.unicorn.web.config.WebConfig.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "net.brainage.unicorn.web.controller" })
public class WebConfig extends WebMvcConfigurerAdapter
{
    
    /* --------------------------------------------------------------- */
    /* Bean Definitions */
    /* --------------------------------------------------------------- */
    
    private static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/views/";
    
    private static final String VIEW_RESOLVER_SUFFIX = ".jsp";
    
    /**
     * Create view resolver
     * 
     * @return InternalResourceViewResolver instance
     */
    @Bean
    public ViewResolver viewResolver()
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix(VIEW_RESOLVER_PREFIX);
        viewResolver.setSuffix(VIEW_RESOLVER_SUFFIX);
        return viewResolver;
    }
    
}
