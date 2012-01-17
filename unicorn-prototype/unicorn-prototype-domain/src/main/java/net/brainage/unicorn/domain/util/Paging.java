/*
 * (#) net.brainage.unicorn.domain.util.Paging.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.domain.util;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
public class Paging
{
    
    public static final int DEFAULT_PAGE_NO = 1;
    
    public static final int DEFAULT_LIST_SIZE = 10;
    
    public static final int DEFAULT_PAGING_LINK_SIZE = 10;
    
    private int pageNo = DEFAULT_PAGE_NO;
    
    private int totalCount;
    
    private int totalPage;
    
    private int listSize = DEFAULT_LIST_SIZE;
    
    private int pagingLinkSize = DEFAULT_PAGING_LINK_SIZE;
    
    private int startIndex;
    
    private int endIndex;
    
    /**
     * 
     */
    public Paging()
    {
        this(DEFAULT_LIST_SIZE, DEFAULT_PAGING_LINK_SIZE);
    }
    
    /**
     * @param listSize
     */
    public Paging(int listSize)
    {
        this(listSize, DEFAULT_PAGING_LINK_SIZE);
    }
    
    /**
     * @param listSize
     * @param pagingLinkSize
     */
    public Paging(int listSize, int pagingLinkSize)
    {
        this.listSize = listSize;
        this.pagingLinkSize = pagingLinkSize;
    }
    
    /**
     * @return the pageNo
     */
    public int getPageNo()
    {
        return pageNo;
    }
    
    /**
     * @param pageNo the pageNo to set
     */
    public void setPageNo(int pageNo)
    {
        this.pageNo = pageNo;
    }
    
    /**
     * @return the totalCount
     */
    public int getTotalCount()
    {
        return totalCount;
    }
    
    /**
     * @param totalCount the totalCount to set
     */
    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }
    
    /**
     * @return the listSize
     */
    public int getListSize()
    {
        return listSize;
    }
    
    /**
     * @param listSize the listSize to set
     */
    public void setListSize(int listSize)
    {
        this.listSize = listSize;
    }
    
    /**
     * @return the pagingLinkSize
     */
    public int getPagingLinkSize()
    {
        return pagingLinkSize;
    }
    
    /**
     * @param pagingLinkSize the pagingLinkSize to set
     */
    public void setPagingLinkSize(int pagingLinkSize)
    {
        this.pagingLinkSize = pagingLinkSize;
    }
    
    /**
     * @return the totalPage
     */
    public int getTotalPage()
    {
        return totalPage;
    }
    
    /**
     * @return the startIndex
     */
    public int getStartIndex()
    {
        return startIndex;
    }
    
    /**
     * @return the endIndex
     */
    public int getEndIndex()
    {
        return endIndex;
    }
    
}
