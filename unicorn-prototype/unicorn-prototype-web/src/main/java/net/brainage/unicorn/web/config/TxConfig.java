/*
 * (#) net.brainage.unicorn.web.config.TxConfig.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.web.config;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
@Configuration
@EnableTransactionManagement
public class TxConfig implements TransactionManagementConfigurer
{
    
    private static final Logger log = LoggerFactory.getLogger(TxConfig.class);
    
    @Inject
    DataSource dataSource;
    
    @Bean
    public PlatformTransactionManager txManager()
    {
        if (log.isInfoEnabled())
        {
            log.info("create {} bean.", "PlatformTransactionManager");
        }
        return new DataSourceTransactionManager(dataSource);
    }
    
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager()
    {
        return txManager();
    }
    
}
