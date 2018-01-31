package spring.action.chap10.jdbctemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chap10.jdbctemplate.config.DataSourceConfig;
import spring.action.chap10.jdbctemplate.config.model.User;
import spring.action.chap10.jdbctemplate.config.repository.DefaultUserRepository;
import spring.action.chap10.jdbctemplate.config.repository.UserRepository;

/**
 * Created by kieren on 18/1/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfig.class)
public class JdbcTemplateTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testConnection () {

    }

    @Test
    public void testRepository () {
        User user = userRepository.findOne(1L);
        System.out.println(user);
    }

}
