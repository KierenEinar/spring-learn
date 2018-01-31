package spring.action.chap3.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kieren on 18/1/25.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AopTest {
    @Autowired
    private Operation operation;

    @Test
    public void operateTest () {
        operation.transfer();
    }


}
