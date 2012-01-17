/*
 * (#) net.brainage.unicorn.web.config.AppConfig.java
 * Created on 2012. 1. 12.
 */
package net.brainage.unicorn.web.config;

import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jolbox.bonecp.BoneCPDataSource;

/**
 * 
 *
 * @author ms29.seo@gmail.com
 * @version 0.1
 */
@Configuration
@Import({ TxConfig.class, MapperConfig.class })
public class AppConfig
{

    /**
     * 
     */
    private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer()
    {
        if (log.isInfoEnabled())
        {
            log.info("create {} bean.", "PropertySourcesPlaceholderConfigurer");
        }
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocations(new Resource[] {
                new ClassPathResource("config/app-config.properties"),
                new ClassPathResource("config/jdbc-config.properties") });
        return configurer;
    }

    @Configuration
    @Profile("dev")
    static class DevDatabaseConfig
    {

        @Value("${dev.jdbc.driverClass}")
        String driverClass;

        @Value("${dev.jdbc.url}")
        String jdbcUrl;

        @Value("${dev.jdbc.username}")
        String username;

        @Value("${dev.jdbc.password}")
        String password;

        @Bean
        public DataSource dataSource()
        {
            if (log.isInfoEnabled())
            {
                log.info("create {} bean.", "DriverManagerDataSource");
            }
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName(driverClass);
            ds.setUrl(jdbcUrl);
            ds.setUsername(username);
            ds.setPassword(password);
            return ds;
        }

    }

    @Configuration
    @Profile("production")
    static class ProductionDatabaseConfig
    {

        @Value("${prd.jdbc.driverClass}")
        String driverClass;

        @Value("${prd.jdbc.url}")
        String jdbcUrl;

        @Value("${prd.jdbc.username}")
        String username;

        @Value("${prd.jdbc.password}")
        String password;

        @Value("${prd.jdbc.idleConnectionTestPeriod}")
        int idleConnectionTestPeriod;

        @Value("${prd.jdbc.idleMaxAge}")
        int idleMaxAge;

        @Value("${prd.jdbc.maxConnectionsPerPartition}")
        int maxConnectionsPerPartition;

        @Value("${prd.jdbc.minConnectionsPerPartition}")
        int minConnectionsPerPartition;

        @Value("${prd.jdbc.partitionCount}")
        int partitionCount;

        @Value("${prd.jdbc.acquireIncrement}")
        int acquireIncrement;

        @Value("${prd.jdbc.statementsCacheSize}")
        int statementsCacheSize;

        @Value("${prd.jdbc.releaseHelperThreads}")
        int releaseHelperThreads;

        @Bean(destroyMethod = "close")
        public DataSource dataSource()
        {
            if (log.isInfoEnabled())
            {
                log.info("create {} bean.", "BoneCPDataSource");
            }
            BoneCPDataSource ds = new BoneCPDataSource();
            ds.setDriverClass(driverClass);
            ds.setJdbcUrl(jdbcUrl);
            ds.setUsername(username);
            ds.setPassword(password);

            ds.setIdleConnectionTestPeriod(idleConnectionTestPeriod, TimeUnit.SECONDS);
            ds.setIdleMaxAge(idleMaxAge, TimeUnit.SECONDS);
            ds.setMaxConnectionsPerPartition(maxConnectionsPerPartition);
            ds.setMinConnectionsPerPartition(minConnectionsPerPartition);
            ds.setAcquireIncrement(acquireIncrement);
            ds.setStatementsCacheSize(statementsCacheSize);
            ds.setReleaseHelperThreads(releaseHelperThreads);

            return ds;
        }

    }

}
