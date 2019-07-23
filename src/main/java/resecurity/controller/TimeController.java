package resecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeController {

    @RequestMapping("/time")
    public String getDate(){
        return new Date().toString();
    }
}
