package spring.action.chap11.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import spring.action.chap11.hibernate.repository.UserRepository;
import spring.action.chap11.hibernate.service.UserService;

/**
 * Created by kieren on 18/1/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class HibernateTest {

    @Autowired
    private UserService userService;

    @Test
    public void testHibernate () {
        System.out.println(userService.findOne(1L));
    }

}
