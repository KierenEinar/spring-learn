package spring.action.chap3.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by kieren on 18/1/25.
 */
@Aspect
@Component
public class Log {

    @Pointcut("execution( public * *(..) )")
    public void operation() {}

    @Before("operation()")
    public void before () {
        System.out.println("log before...");
    }
    @After("operation()")
    public void after () {
        System.out.println("log after...");
    }
    @AfterReturning("operation()")
    public void afterReturning () {
        System.out.println("log afterReturning...");
    }
    @AfterThrowing("operation()")
    public void afterThrowing () {
        System.out.println("log afterThrowing...");
    }

}
