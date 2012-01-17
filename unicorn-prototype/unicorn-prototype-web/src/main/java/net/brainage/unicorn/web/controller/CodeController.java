/*
 * (#) net.brainage.unicorn.web.controller.CodeController.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
@Controller
@RequestMapping(value = "/code")
public class CodeController
{
    
    /**
     * Logging Framework Instance by slf4j
     */
    private static final Logger log = LoggerFactory.getLogger(CodeController.class);
    
    /**
     * 
     */
    private static final String VIEW_GET_CODE_LIST = "code/list";
    
    /**
     * 
     */
    private static final String VIEW_GET_CODE_DETAILS = "code/details";
    
    /**
     * 
     */
    private static final String VIEW_GET_CREATE_CODE_FORM = "code/createForm";
    
    /**
     * 
     */
    private static final String VIEW_GET_EDIT_CODE_FORM = "code/editForm";
    
    /**
     * @param model
     * @return
     */
    @RequestMapping(value = "/new", method = { RequestMethod.GET, RequestMethod.POST })
    public String getCreateCodeForm(Model model)
    {
        if (log.isDebugEnabled())
        {
            log.debug(">> start getCreateCodeForm()");
        }
        
        if (log.isDebugEnabled())
        {
            log.debug(">> end getCreateCodeForm()");
        }
        return VIEW_GET_CREATE_CODE_FORM;
    }
    
    /**
     * @param model
     * @return
     */
    @RequestMapping(value = { "/list", "/search" })
    public String getCodeList(Model model)
    {
        if (log.isDebugEnabled())
        {
            log.debug(">> start getCodeList()");
        }
        
        if (log.isDebugEnabled())
        {
            log.debug(">> end getCodeList()");
        }
        return VIEW_GET_CODE_LIST;
    }
    
    /**
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}")
    public String getCodeDetails(@PathVariable("id") String id, Model model)
    {
        if (log.isDebugEnabled())
        {
            log.debug(">> start getCodeDetails()");
        }
        
        if (log.isDebugEnabled())
        {
            log.debug(">> end getCodeDetails()");
        }
        return VIEW_GET_CODE_DETAILS;
    }
    
    /**
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}/edit")
    public String getEditCodeForm(@PathVariable("id") String id, Model model)
    {
        if (log.isDebugEnabled())
        {
            log.debug(">> start getEditCodeForm()");
        }
        
        if (log.isDebugEnabled())
        {
            log.debug(">> end getEditCodeForm()");
        }
        return VIEW_GET_EDIT_CODE_FORM;
    }
    
}
