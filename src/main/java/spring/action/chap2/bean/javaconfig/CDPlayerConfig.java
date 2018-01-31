package spring.action.chap2.bean.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kieren on 18/1/24.
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CD cd) {
        return new CDPlayer(cd);
    }

    @Bean
    public CD cd () {
        return new Blues();
    }

}
