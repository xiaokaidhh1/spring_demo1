package com.kai.service.impl;

import com.kai.service.Ink;
import com.kai.service.Paper;
import com.kai.service.Printer;

public class HpPrinter implements Printer {
    private Ink ink;
    private Paper paper;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    @Override
    public void print(String word) {
        ink.giveColor();
      String printword =  paper.transformWord(word);
        System.out.println(printword);

    }
}
