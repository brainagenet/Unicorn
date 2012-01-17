/*
 * (#) net.brainage.unicorn.domain.model.Code.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.domain.model;

import java.util.Date;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
public class Code
{
    /**
     * 
     */
    private String id;
    
    /**
     * 
     */
    private String name;
    
    /**
     * 
     */
    private String description;
    
    /**
     * 
     */
    private String useYn = "Y";
    
    /**
     * 
     */
    private Date createdOn;
    
    /**
     * 
     */
    public Code()
    {
    }
    
    /**
     * @param id
     * @param name
     */
    public Code(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    /**
     * @return the useYn
     */
    public String getUseYn()
    {
        return useYn;
    }
    
    /**
     * @param useYn the useYn to set
     */
    public void setUseYn(String useYn)
    {
        this.useYn = useYn;
    }
    
    /**
     * @return the createdOn
     */
    public Date getCreatedOn()
    {
        return createdOn;
    }
    
    /**
     * @param createdOn the createdOn to set
     */
    public void setCreatedOn(Date createdOn)
    {
        this.createdOn = createdOn;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder buff = new StringBuilder();
        buff.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode()));
        buff.append(" {");
        buff.append(" id='").append(id).append("',");
        buff.append(" name='").append(name).append("',");
        buff.append(" description='").append(description).append("',");
        buff.append(" useYn='").append(useYn).append("',");
        buff.append(" createdOn='").append(createdOn).append("'");
        buff.append(" }");
        return buff.toString();
    }
    
}
