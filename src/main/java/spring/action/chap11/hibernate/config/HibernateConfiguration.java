package spring.action.chap11.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
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
@EnableTransactionManagement
@Import(DataSourceConfiguration.class)
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

    @Bean
    public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
        return txManager;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty(AvailableSettings.DIALECT, dialact);
        properties.setProperty(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, currentSessionContextClass);
        return properties;
    }



}
