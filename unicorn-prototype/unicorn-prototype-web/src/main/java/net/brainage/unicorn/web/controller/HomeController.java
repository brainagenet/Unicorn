/*
 * (#) net.brainage.unicorn.web.controller.HomeController.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
@Controller
public class HomeController
{
    /**
     * Logging Framework Instance by slf4j
     */
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);
    
    /**
     * view name for 'getHome()'
     */
    protected static final String HOME_VIEW = "home";
    
    /**
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome()
    {
        if (log.isInfoEnabled())
        {
            log.info("invoked getHome()...");
        }
        return HOME_VIEW;
    }
    
}
