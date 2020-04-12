package dong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean getMyConfigBean(){
        return new MyConfigBean();
    }
}
