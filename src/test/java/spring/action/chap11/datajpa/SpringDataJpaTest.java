package spring.action.chap11.datajpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chap11.datajpa.service.UserService;

/**
 * Created by kieren on 18/2/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class SpringDataJpaTest {

    @Autowired
    private UserService userService;

    @Test
    public void testDataJpa () {
        System.out.println(userService.findOne(1L));
    }


}
