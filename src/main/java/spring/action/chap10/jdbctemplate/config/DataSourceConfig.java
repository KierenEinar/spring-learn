package spring.action.chap10.jdbctemplate.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by kieren on 18/1/26.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:conf/mysql-config.properties")
public class DataSourceConfig {

    @Value("${mysql.username}")
    private String username;

    @Value("${mysql.password}")
    private String password;

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.driverClassName}")
    private String driverClassName;

    @Value("${mysql.maxActive}")
    private Integer maxActive;

    @Value("${mysql.minIdle}")
    private Integer minIdle;

    @Value("${mysql.maxIdle}")
    private Integer maxIdle;

    @Value("${mysql.initialSize}")
    private Integer initialSize;

    @Value("${mysql.maxWait}")
    private Integer maxWait;

    @Value("${mysql.validationQuery}")
    private String validationQuery;

    @Value("${mysql.testOnBorrow}")
    private Boolean testOnBorrow;

    @Bean
    public DataSource dataSource () {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setMaxIdle(maxIdle);
        dataSource.setMinIdle(minIdle);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWaitMillis(maxWait);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestOnBorrow(testOnBorrow);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }



}


