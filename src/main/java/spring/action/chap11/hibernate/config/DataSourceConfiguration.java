package spring.action.chap11.hibernate.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.stream.StreamSupport;

/**
 * Created by kieren on 18/1/30.
 */
@Configuration
@PropertySource("classpath:conf/mysql-config.properties")
public class DataSourceConfiguration {

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


}
