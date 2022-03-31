package com.kai.service.impl;

import com.kai.service.Ink;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class EsInk implements Ink {
    @Override
    public void giveColor() {
        System.out.println("开始喷弄4墨");
    }
}
