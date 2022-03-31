package com.kai.service.impl;

import com.kai.service.Paper;
import org.springframework.stereotype.Component;

@Component
public class A4Paper implements Paper {
    @Override
    public String transformWord(String word) {
        StringBuilder sb = new StringBuilder();
        int page = 0;
        for(int i=0;i<word.length();i++)
        {
            if((i+1)%7==0){//每7个换行
                sb.append("\n");
            }
            if((i+1)%24==0) {
                page+=1;
                sb.append("\n----------------------第"+page+"页------------------\n");
            }
            char c = word.charAt(i);
            sb.append(c);

        }
        return sb.toString();
    }
}
