package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigManager {
    @Bean(name="watchman1")
    public Watchman watchman(){
        return new Watchman("Пупкин");
    }

    @Bean(name = "park1")
    public Park park(){
//        Park p = new Park();
//        p.setWatchman(w);
        return new Park();
    }

//    @Bean(name = "watchman2")
//    public Watchman watchmanInPark(Park park){
//        Watchman w = new Watchman("Василий Иваныч");
//        w.setPark(park);
//        return w;
//    }
}
