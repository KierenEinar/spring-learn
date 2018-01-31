package spring.action.chap2.bean.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kieren on 18/1/24.
 */
@Configuration
public class CDConfig {
    @Bean
    public CD cd () {
        return new Blues();
    }
}
