package com.knoldus.Controller;
import com.knoldus.Service.CurrentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentTimeController {
    @Autowired
    CurrentTimeService currentTime;
    @GetMapping("/status")
    public String getTime(){
        return "Running" + " : " +  currentTime.getCurrentTime();
    }
}
