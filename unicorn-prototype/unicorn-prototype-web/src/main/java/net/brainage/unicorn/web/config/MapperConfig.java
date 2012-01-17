/*
 * (#) net.brainage.unicorn.web.config.MapperConfig.java
 * Created on 2012. 1. 17.
 */
package net.brainage.unicorn.web.config;

import javax.inject.Inject;
import javax.sql.DataSource;

import net.brainage.unicorn.domain.dao.Mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
@Configuration
public class MapperConfig
{

    private static final Logger log = LoggerFactory.getLogger(MapperConfig.class);

    @Inject
    DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception
    {
        if (log.isInfoEnabled())
        {
            log.info("create {} bean by {}.", "SqlSessionFactory", "SqlSessionFactoryBean");
        }
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("net.brainage.unicorn.domain.model");
        return factoryBean.getObject();
    }

    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer()
    {
        if (log.isInfoEnabled())
        {
            log.info("create {} bean.", "MapperScannerConfigurer");
        }
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage("net.brainage.unicorn.dao");
        scannerConfigurer.setMarkerInterface(Mapper.class);
        return scannerConfigurer;
    }

}
