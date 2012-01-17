/*
 * (#) net.brainage.unicorn.domain.dao.CodeDao.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.domain.dao;

import java.util.List;

import net.brainage.unicorn.domain.model.Code;
import net.brainage.unicorn.domain.model.Criteria;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
public interface CodeDao
{
    
    public Code selectCode(String id);
    
    public int selectCodeCount(Criteria criteria);
    
    public List<Code> selectCodeList(Criteria criteria);
    
    public List<Code> selectCodeListOnPage(Criteria criteria);
    
    public int insertCode(Code code);
    
    public int updateCode(Code code);
    
    public int deleteCode(String id);
    
}
