package com.jbit.tools;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {

    private  String dateparm;
    //无参构造
    public  StringToDate(String dateparm){
        this.dateparm=dateparm;
    }

    // 这是什么意思？

    @Override
    public Date convert(String s) {
        Date date=null;
        try {
            date=new SimpleDateFormat(dateparm).parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
