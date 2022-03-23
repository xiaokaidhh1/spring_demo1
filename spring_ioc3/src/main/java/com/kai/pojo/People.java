package com.kai.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class People {
    //如果显示定义了required为false,说明这个属性可以为空，否则不允许
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;


    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
    }
}
