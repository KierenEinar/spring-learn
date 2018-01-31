package spring.action.chap3.aop;

import org.springframework.stereotype.Component;

/**
 * Created by kieren on 18/1/25.
 */
@Component
public class CBOperation implements Operation {

    public void withDraw() {
        System.out.println("中国银行提现");
    }

    public void transfer() {
        System.out.println("中国银行转账");
    }
}
