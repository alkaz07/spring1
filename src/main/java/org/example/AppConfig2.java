package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean(name = "watchmanA")
    public Watchman watchmanA(){
        return new Watchman("Иванов");
    }
    @Bean(name = "watchmanB")
    public Watchman watchmanB(){
        return new Watchman("Петров");
    }

    @Bean(name="park")
    public Park park(){
        return new Park();
    }

}
