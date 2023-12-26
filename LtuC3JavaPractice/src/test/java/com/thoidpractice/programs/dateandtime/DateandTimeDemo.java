package com.thoidpractice.programs.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTimeDemo {

    public static void main(String[] args) {
        String s = DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(LocalDateTime.now());
        System.out.println(s);
    }


}
