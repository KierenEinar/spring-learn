package spring.action.chap11.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chap11.hibernate.repository.UserRepository;

/**
 * Created by kieren on 18/1/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class HibernateTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testHibernate () {
        System.out.println(userRepository.findOne(1L));
    }

}
