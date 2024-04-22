package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("watchman1")
public class Watchman {
    @Autowired
    private  Park park;

    String name;



    public void whistle(){
        System.out.println(name+" свистит");
    }


    public void setPark(Park park) {
        this.park = park;
    }

    public Watchman(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Watchman{" +
                "park=" + park +
                ", name='" + name + '\'' +
                '}';
    }
}
