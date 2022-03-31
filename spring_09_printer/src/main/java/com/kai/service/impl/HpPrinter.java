package com.kai.service.impl;

import com.kai.service.Ink;
import com.kai.service.Paper;
import com.kai.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class HpPrinter implements Printer {
    @Autowired
    private Ink ink;
    @Autowired
    private Paper paper;


    @Override
    public void print(String word) {
        ink.giveColor();
      String printword =  paper.transformWord(word);
        System.out.println(printword);

    }
}
