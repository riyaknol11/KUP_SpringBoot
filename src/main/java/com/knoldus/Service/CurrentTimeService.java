package com.knoldus.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class CurrentTimeService {
    public String getCurrentTime(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formattedTime.format(time);
    }
}
