package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {
    @Bean(name = "watchmanA")
    public Watchman watchmanA(){
        return new Watchman("Иванов");
    }
    @Bean(name = "watchmanC")
    public Watchman watchmanC(){
        return new Watchman("Сидоров");
    }

    @Bean(name="park")
    public Park park(){
        return new Park();
    }

}
