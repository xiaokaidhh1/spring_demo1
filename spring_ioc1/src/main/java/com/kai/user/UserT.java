package com.kai.user;

public class UserT {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserT{" +
                "name='" + name + '\'' +
                '}';
    }
}
