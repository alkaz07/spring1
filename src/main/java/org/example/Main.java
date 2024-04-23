package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      //  example1();
        example2();
        example3();
    }

    private static void example3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
        Watchman w1= context.getBean("watchmanA", Watchman.class);
        System.out.println(w1);
       // Watchman w2 = context.getBean("watchmanB", Watchman.class);
       // System.out.println(w2);
        Park p = context.getBean("park", Park.class);
        p.doNoise();
        p.doNotWalkOnTheGrass();

    }

    private static void example2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        Watchman w1= context.getBean("watchmanA", Watchman.class);
        System.out.println(w1);
        Watchman w2 = context.getBean("watchmanB", Watchman.class);
        System.out.println(w2);
        Park p = context.getBean("park", Park.class);
        p.doNoise();
        p.doNotWalkOnTheGrass();

    }

    private static void example1() {
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