package com.kai.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于  <bean id="user" class="com.kai.pojo.User"/>
@Component
public class User {
    @Value("xiaokai")
    public String name ;
}
