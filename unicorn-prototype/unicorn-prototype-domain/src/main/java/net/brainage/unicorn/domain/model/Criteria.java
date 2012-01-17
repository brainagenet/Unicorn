/*
 * (#) net.brainage.unicorn.domain.criteria.Criteria.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.domain.model;

import net.brainage.unicorn.domain.util.Paging;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
public class Criteria
{
    
    /**
     * 
     */
    private Paging paging;
    
    /**
     * 
     */
    private int searchKey;
    
    /**
     * 
     */
    private String searchKeyword;
    
    /**
     * 
     */
    public Criteria()
    {
        this(Paging.DEFAULT_LIST_SIZE, Paging.DEFAULT_PAGING_LINK_SIZE);
    }
    
    /**
     * @param listSize
     */
    public Criteria(int listSize)
    {
        this(listSize, Paging.DEFAULT_PAGING_LINK_SIZE);
    }
    
    /**
     * @param listSize
     * @param pagingLinkSize
     */
    public Criteria(int listSize, int pagingLinkSize)
    {
        this.paging = new Paging(listSize, pagingLinkSize);
    }
    
    /**
     * @return the searchKey
     */
    public int getSearchKey()
    {
        return searchKey;
    }
    
    /**
     * @param searchKey the searchKey to set
     */
    public void setSearchKey(int searchKey)
    {
        this.searchKey = searchKey;
    }
    
    /**
     * @return the searchKeyword
     */
    public String getSearchKeyword()
    {
        return searchKeyword;
    }
    
    /**
     * @param searchKeyword the searchKeyword to set
     */
    public void setSearchKeyword(String searchKeyword)
    {
        this.searchKeyword = searchKeyword;
    }
    
    /**
     * @return the paging
     */
    public Paging getPaging()
    {
        return paging;
    }
    
}
