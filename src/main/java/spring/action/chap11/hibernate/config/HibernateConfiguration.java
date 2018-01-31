package spring.action.chap11.hibernate.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by kieren on 18/1/30.
 */
@Configuration
@PropertySource("classpath:conf/hibernate-config.properties")
@Import(DataSourceConfiguration.class)
@EnableTransactionManagement(proxyTargetClass = true)
public class HibernateConfiguration {

    @Value("${packageToScan}")
    private String packageToScan;

    @Value("${dialact}")
    private String dialact;

    @Value("${show_sql}")
    private boolean showSql;

    @Value("${current_session_context_class}")
    private String currentSessionContextClass;


    @Bean
    public LocalSessionFactoryBean localSessionFactoryBean (DataSource dataSource) {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setHibernateProperties(this.hibernateProperties());
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setPackagesToScan(packageToScan);
        return localSessionFactoryBean;
    }

    @Bean (name="transactionManager")
    public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
        return txManager;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", dialact);
        properties.setProperty("hibernate.current_session_context_class", currentSessionContextClass);
        return properties;
    }



}