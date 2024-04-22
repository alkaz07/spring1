package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(ConfigManager.class);
       Watchman w = context.getBean("watchman1", Watchman.class);
       Park p = context.getBean("park1", Park.class);

       p.doNoise();
       p.doNotWalkOnTheGrass();
        System.out.println(w);

     //   Watchman w2 = context.getBean("watchman2", Watchman.class);
      //  System.out.println(w2);
    }
}