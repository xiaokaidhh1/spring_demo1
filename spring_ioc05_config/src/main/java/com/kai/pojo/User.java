package com.kai.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//等价于  <bean id="user" class="com.kai.pojo.User"/>
@Component //被spring 接管了，注册到了容器中
@ComponentScan("com.kai.pojo")
public class User {
    //s属性注入值
    @Value("xiaokai")
    public String name ;
}
