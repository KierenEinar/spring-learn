package spring.action.chap2.bean.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by kieren on 18/1/24.
 */
@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer (CD cd) {
        return new CDPlayer(cd);
    }
}
