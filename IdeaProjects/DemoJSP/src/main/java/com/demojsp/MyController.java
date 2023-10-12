package com.demojsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
    Name    : Monu KD (monukd01dev)
    Project : DemoJSP
    Date    : 13-Oct-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Controller
public class MyController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
