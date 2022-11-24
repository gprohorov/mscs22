package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  CustomerConfig
  @version  1.0.0 
  @since 24.11.22 - 20.42
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
