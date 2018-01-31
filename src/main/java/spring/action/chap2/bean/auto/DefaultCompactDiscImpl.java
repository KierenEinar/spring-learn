package spring.action.chap2.bean.auto;

import org.springframework.stereotype.Component;

/**
 * Created by kieren on 18/1/24.
 */
@Component
public class DefaultCompactDiscImpl implements CompactDisc{

    public void play() {
        System.out.println("play disc");
    }
}
