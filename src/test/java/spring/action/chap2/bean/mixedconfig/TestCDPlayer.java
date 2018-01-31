package spring.action.chap2.bean.mixedconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kieren on 18/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class TestCDPlayer {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void testPlayer () {
        cdPlayer.play();
    }

}
