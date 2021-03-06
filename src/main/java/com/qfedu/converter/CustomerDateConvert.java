package com.qfedu.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 19:52
 * description:
 */
public class CustomerDateConvert implements Converter<String, Date>{
    private SimpleDateFormat[] sdfs=new SimpleDateFormat[]{
            new SimpleDateFormat ("yyyy-MM-dd"),
            new SimpleDateFormat ("yyyyMMdd"),
            new SimpleDateFormat ("yyyy年MM月dd日"),
            new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss")
    };

    @Override
    public Date convert(String s) {
        if(s==null||s.isEmpty()){
            return null;
        }
        for (SimpleDateFormat sdf : sdfs){
            try {
                return sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
                continue;
            }
        }
        return null;
    }
}
